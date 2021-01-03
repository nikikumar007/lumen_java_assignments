package com.training;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;

import com.training.daos.DoctorDaoImpl;
import com.training.entity.Doctor;
import com.training.ifaces.DataAccess;
import com.training.util.DbConnectionUtil;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con=DbConnectionUtil.getMySqlConnection();
		DatabaseMetaData metaData=con.getMetaData();
		 System.out.println("Database Metadata:" + metaData.getClass().getName());
		 System.out.println("Database Metadata Connection Url:" + metaData.getURL());
		 System.out.println("Database Metadata Connection Url:" + metaData.getDatabaseProductName());
		}
		catch(SQLException e)
		{
	     e.printStackTrace();
		}
int key=2;
DataAccess<Doctor> dao=new DoctorDaoImpl();
switch (key) {
case 1: {
	Doctor doctor1=new Doctor(103, "Suhas", 9198754621l, "Ortho ", LocalDate.of(1992, Month.DECEMBER, 12));
	int rowAdded=dao.add(doctor1);
	System.out.println("Row added" +rowAdded);
	break;
}
case 2:
	dao.findAll().stream().forEach(System.out::println);
	break;
case 3:
	Doctor doctor1=	dao.findById(102);
	System.out.println(doctor1);
	break;
case 4:
	int rowRemoved=dao.remove(101);
	System.out.println("Row Removed" +rowRemoved);
	break;
case 5:
	Doctor doc1=new Doctor(105, "Ram", 7894561235l, "Ortho ", LocalDate.of(1992, Month.MARCH, 10));
	Doctor doc2=new Doctor(106, "Sham", 4587962515l, "Skin ", LocalDate.of(1992, Month.FEBRUARY, 24));
	int []result=dao.addInBatch(doc1,doc2);
	for(int results:result)
	{
		System.out.println(results);
	}
case 6:
	DoctorDaoImpl dao2=(DoctorDaoImpl)dao;
	 dao2.usingTransaction();
default:
	throw new IllegalArgumentException("Unexpected value: " + key);
}
	}

}
