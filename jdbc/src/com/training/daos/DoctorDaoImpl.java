package com.training.daos;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.training.entity.Doctor;
import com.training.ifaces.DataAccess;
import com.training.util.DbConnectionUtil;

public class DoctorDaoImpl implements DataAccess<Doctor> {
	private static final String ADDSQL ="insert into lumen_doctor values(?,?,?,?,?)";
	private Connection con;

	public DoctorDaoImpl(Connection con) {
		super();
		this.con = con;                           
	}                                             

	public DoctorDaoImpl() {
		super();
		con = DbConnectionUtil.getMySqlConnection();
	}

	@Override
	public int add(Doctor t) {

		String sql = "insert into lumen_doctor values(?,?,?,?,?)";
		int rowsAdded = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, t.getDoctorId());
			pstmt.setString(2, t.getDoctorName());
			pstmt.setLong(3, t.getMobileNumber());
			pstmt.setString(4, t.getSpecialization());
			pstmt.setDate(5, Date.valueOf(t.getDateOfBirth()));

			rowsAdded = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from lumen_doctor";
		List<Doctor> doctorList = new ArrayList<Doctor>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmeta=rs.getMetaData();
			System.out.println("Column Count :" +rsmeta.getColumnCount());
			while (rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorName = rs.getString("doctorName");
				Long mobileNumber = rs.getLong("mobileNumber");
				String specialization = rs.getString("specialization");
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();

				Doctor doctor = new Doctor(doctorId, doctorName, mobileNumber, specialization, dateOfBirth);
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctorList;
	}

	@Override
	public int update(Doctor ex, Doctor update) {
		// TODO Auto-generated method stub
		String sql = "update lumen_doctor set docId=?, docName=?,mobilNum=?,specialization=?,dob=? where docId=?";
		int rowsUpdated = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, update.getDoctorId());
			pstmt.setString(2, update.getDoctorName());
			pstmt.setLong(3, update.getMobileNumber());
			pstmt.setString(4, update.getSpecialization());
			pstmt.setDate(5, Date.valueOf(update.getDateOfBirth()));
			pstmt.setInt(6, ex.getDoctorId());

			rowsUpdated = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
	}

	@Override
	public int remove(int id) {
		int rowRemoved = 0;
		String sql = "delete from lumen_doctor where doctorId=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			rowRemoved = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowRemoved;
	}

	@Override
	public Doctor findById(int id) {
		String sql = "select * from lumen_doctor where doctorId=?";
		Doctor doctor = null;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorName = rs.getString("doctorName");
				Long mobileNumber = rs.getLong("mobileNumber");
				String specialization = rs.getString("specialization");
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();

				doctor = new Doctor(doctorId, doctorName, mobileNumber, specialization, dateOfBirth);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return doctor;

	}
	@Override
	public int[] addInBatch(Doctor ...list)
	{
		int[] rows=null;
		try(PreparedStatement pstmt = con.prepareStatement(ADDSQL))
		{
			con.setAutoCommit(false);
			for(Doctor eachDoctor:list)
			{
				pstmt.setInt(1, eachDoctor.getDoctorId());
				pstmt.setString(2, eachDoctor.getDoctorName());
				pstmt.setLong(3, eachDoctor.getMobileNumber());
				pstmt.setString(4, eachDoctor.getSpecialization());
				pstmt.setDate(5, Date.valueOf(eachDoctor.getDateOfBirth()));
				pstmt.addBatch();
			}
			rows=pstmt.executeBatch();
			con.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rows;
	}   
	public void usingTransaction() {
	 		 
	    		 String sql1 = "insert into lumen_doctor(doctorId,doctorName) values(?,?)";
        		 String sql2 = "inseert into lumen_doctor(doctorId,doctorName) values(?,?)";
        		 Savepoint p1=null;
        		 try {
        			
        			  con.setAutoCommit(false);
        			 PreparedStatement pstmt1 = con.prepareStatement(sql1);
        			 PreparedStatement pstmt2 = con.prepareStatement(sql2);
        			 
        			  pstmt1.setInt(1, 201);
        			  pstmt1.setString(2, "dummy");
        			 
        			 pstmt1.executeUpdate();
        			 
        			  p1 = con.setSavepoint("point1");
        			  
        			  pstmt2.setInt(1, 202);
        			  pstmt2.setString(2, "munna");
        			  
        			  pstmt2.executeUpdate();
        			  
        			  con.commit();
        			  
        			  con.setAutoCommit(true);
        			 
        		} catch (SQLException e) {
        			
        			e.printStackTrace();
        			
        			try {
        				con.rollback(p1);
        			} catch (SQLException e1) {
        				e1.printStackTrace();
        			}
        		}
        	 }
	
	
        }
        