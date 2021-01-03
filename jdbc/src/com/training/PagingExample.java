package com.training;

import java.time.LocalDate;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;

import com.training.entity.Doctor;
import com.training.util.DbConnectionUtil;

public class PagingExample {
	public static void main(String[] args) {
		try {
			CachedRowSet rowSet=(CachedRowSet) DbConnectionUtil.getCachedRowSet();
			String sql="select * from lumen_doctor";
			rowSet.setCommand(sql);
			rowSet.setPageSize(1);
			rowSet.execute();
			int page=1;
			do
			{
				System.out.println("Page ======"+page);
			while(rowSet.next())
			{
				int doctorId=rowSet.getInt("doctorID");
				String doctorName = rowSet.getString("doctorName");
				Long mobileNumber = rowSet.getLong("mobileNumber");
				String specialization = rowSet.getString("specialization");
				LocalDate dateOfBirth = rowSet.getDate("dateOfBirth").toLocalDate();
Doctor doctor = new Doctor(doctorId, doctorName, mobileNumber, specialization, dateOfBirth);
System.out.println(doctor);
			}
			page++;
		} while(rowSet.nextPage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}

