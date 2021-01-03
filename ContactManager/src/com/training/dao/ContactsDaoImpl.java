package com.training.dao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.training.entity.Contacts;
import com.training.ifaces.DataAccess;
import com.training.util.DbConnectionUtil;


public class ContactsDaoImpl implements DataAccess<Contacts> {

	private Connection con;

	public ContactsDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	public ContactsDaoImpl() {
		super();
		con = DbConnectionUtil.getMySqlConnection();
	}

	@Override
	public int add(Contacts t) {

		String sql = "insert into contacts values(?,?,?,?,?,?,?,?)";
		int rowsAdded = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, t.getId());
			pstmt.setString(2, t.getName());
			pstmt.setLong(3, t.getMobileNumber());
			pstmt.setString(4, t.getAddress());
			pstmt.setString(5, t.getImg());
			pstmt.setDate(6, Date.valueOf(t.getDateOfBirth()));
			pstmt.setString(7, t.getEmail());
			pstmt.setString(8, t.getGroup());

			rowsAdded = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public List<Contacts> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from contact";
		List<Contacts> contactList = new ArrayList<Contacts>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id=rs.getInt("id");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				Long mobileNumber = rs.getLong("mobileNumber");
				String img = rs.getString("Image");
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
				String email = rs.getString("Email");
				String group = rs.getString("Group");
				Contacts contact = new Contacts(id,name, address, mobileNumber, img, dateOfBirth, email, group);
				contactList.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contactList;
	}

	@Override
	public int update(Contacts ex, Contacts update) {
		String sql = "update contacts set id=?, name=?,address=?,mobilenumber=?,img=?,dateOfBirth=?,email=?,group=? where mobilNumber=?";
		int rowsUpdated = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, update.getId());
			pstmt.setString(2, update.getName());
			pstmt.setLong(3, update.getMobileNumber());
			pstmt.setString(4, update.getAddress());
			pstmt.setString(5, update.getImg());
			pstmt.setDate(6, Date.valueOf(update.getDateOfBirth()));
			pstmt.setString(7, update.getEmail());
			pstmt.setString(8, update.getGroup());
			 pstmt.setLong(9, ex.getMobileNumber());

			rowsUpdated = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
	}

	@Override
	public int remove(String mobileNumber) {
		int rowRemoved = 0;
		String sql = "delete from contacts where mobileNumber=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, mobileNumber);
			rowRemoved = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowRemoved;
	}
	
	public List<String> birthdayReport(String month){
		List<String> list = new ArrayList<String>();
		list.add("Birthdays in the month "+month+":-");
		list.add("Date\t\tName");
		String sql = "SELECT c.dateOfBirth,c.Name FROM contacts c WHERE  Month(c.dateOfBirth) =?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, month);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("dateOfBirth")+"\t\t"+rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<String> groupContactReport(){
		List<String> list = new ArrayList<String>();
		list.add("Contacts by group");
		list.add("name\tPhone\tEmail\tgroup");
		String sql = "SELECT c.Name,c.mobileNumber,c.email,c.grp FROM contacts c Order By c.grp ASC";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("Name");
				String Phone = rs.getString("mobileNumber");
				String Email = rs.getString("Email");
				String group = rs.getString("grp");
				
				list.add(name+"\t"+Phone+"\t"+Email+"\t"+group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<String> phoneContactReport(){
		List<String> list = new ArrayList<String>();
		list.add("Contacts with Name and Phone number");
		list.add("name\t\tPhone");
		String sql = "SELECT c.Name,c.mobileNumber FROM contacts c ";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("Name");
				String Phone = rs.getString("mobileNumber");
				
				list.add(name+"\t\t"+Phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<String> emailContactReport(){
		List<String> list = new ArrayList<String>();
		list.add("Contacts with Name and Email");
		list.add("name\t\tEmail");
		String sql = "SELECT c.Name,c.Email FROM contacts c";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("Name");
				String Email = rs.getString("Email");
				
				list.add(name+"\t\t"+Email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<String> groupContactConditionalReport(){
		List<String> list = new ArrayList<String>();
		list.add("Contacts by group");		
		String sql = "SELECT Name,mobileNumber,contacts.Group, counter.count FROM contacts LEFT JOIN (SELECT contacts.Group, count(contacst.Group) as count FROM contacts GROUP BY contacts.Group) counter ON counter.Group = contacts.Group ORDER BY counter.count ASC";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			String currentGroup = "";
			while (rs.next()) {
				String name = rs.getString("Name");
				String Phone = rs.getString("Phone");
				String group = rs.getString("Group");
				System.out.println(currentGroup +" "+group);
				if(!currentGroup.equals(group)) {
					list.add("Group :"+group);
					list.add("name\t\tPhone");
					currentGroup = group;
				}
				//System.out.println(name+"\t\t"+Phone);
				list.add(name+"\t\t"+Phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertCSV(String filepath) {		 
        int batchSize = 20;
 
        try {
 
 
            String sql = "INSERT INTO contacts VALUES (?,?, ?, ?, ?, ?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
 
            BufferedReader lineReader = new BufferedReader(new FileReader(filepath));
            String lineText = null;
 
            int count = 0;
 
            lineReader.readLine(); // skip header line
 
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                statement.setInt(1, 0);
                statement.setString(2, data[0]);
                statement.setString(3, data[1]);
                statement.setString(4, data[2]);
                statement.setString(5, data[3]);
                statement.setDate(6,Date.valueOf(data[4]));
                statement.setString(7, data[5]);
                statement.setString(8, data[6]);
 
                statement.addBatch();
 
                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
 
            lineReader.close();
 
            // execute the remaining queries
            statement.executeBatch();
            con.setAutoCommit(false);
            con.commit();
 
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                con.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
 
	}

	@Override
	public boolean findById(int id) {
		boolean result=false;
		String sql = "select * from contacts where id=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			if(rs.first())
			{
				result=true;
			}
			else
			{
				result=false;
			}
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return result;
}
}

