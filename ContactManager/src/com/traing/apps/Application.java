package com.traing.apps;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.training.dao.ContactsDaoImpl;
import com.training.entity.Contacts;
import com.training.util.DbConnectionUtil;

public class Application {

//	public static boolean isLoggedin = false ;
	public static void generate(List<String> report) {
		try {
		String filename = "report" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		FileWriter writer = new FileWriter("G:\\reports"+filename+".txt"); 
		for(String str: report) {

			writer.write(str + System.lineSeparator());
			
		}
		writer.close();
		System.out.println("Report generated as " + filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		//DataAccess<Contacts> access = new ContactsDaoImpl();
		ContactsDaoImpl access = new ContactsDaoImpl();
		Scanner sc= new Scanner(System.in);
		while(true){
		System.out.println("Enter your choice\n1 : Add contact\n2 : Update Contact\n3 : Delete Contact\n4 : Generate Report\n5 : Exit");
		int mainChoice = sc.nextInt();
		switch(mainChoice) {
		case 1 : 
			System.out.println("Enter your choice\n1 : Enter manually\n2:Add via CSV\n3 : Main menu");
			int addChoice = sc.nextInt();
			switch(addChoice){
			case 1 : //get input from user
				System.out.println("Enter ID");
				int id=sc.nextInt();
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter Address");
				String address=sc.next();
				System.out.println("Enter MobileNumber");
				long mobileNumber=sc.nextLong();
				System.out.println("Enter Image Path");
				String img=sc.next();
				System.out.println("Enter DOB");
				System.out.println("Enter the Date ");
				String date = sc.next();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
				  LocalDate dateOfBirth = LocalDate.parse(date, formatter);
				  System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter group");
				String group=sc.next();
				Contacts contact = new Contacts(id, name, address, mobileNumber, img,dateOfBirth, email, group);
				access.add(contact);
				break;
			case 2 :
				System.out.println("Enter csv location example :- C:\\\\Documents\\\\CSV\\\\contact.csv");
				String path = sc.next();
				access.insertCSV(path);
				break;
			case 3:
				break;
			}
		case 2://update logic
			System.out.println("Enter Mobile Number whose details have to be updated");
			long number=sc.nextLong();
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Address");
			String address=sc.next();
			System.out.println("Enter MobileNumber");
			long mobileNumber=sc.nextLong();
			System.out.println("Enter Image Path");
			String img=sc.next();
			System.out.println("Enter DOB");
			System.out.println("Enter the Date ");
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			  LocalDate dateOfBirth = LocalDate.parse(date, formatter);
			  System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter group");
			String group=sc.next();
			Contacts contact = new Contacts(id, name, address, mobileNumber, img,dateOfBirth, email, group);
			
			
			break;
		case 3://remove
			System.out.println("Enter Phone number to delete");
			String phoneNum = sc.next();
			access.remove(phoneNum);
			break;
		case 4:
			System.out.println("Enter your choice\n1 : Birthdays  - List of the Birthday on a Given Month"
					+ "\n2 : Display the list of Contact by Group"
					+ "\n3 : List of Contacts with their name and email Id"
					+ "\n4 : List of Contact with their name and mobile Number"
					+ "\n5 : Count of Contacts in each Group and display their name and mobile number in the ascending order of the size of the group"
					+ "\n6 : Main Menu");
			int reportChoice = sc.nextInt();
			List<String> report;
			switch(reportChoice) {
			case 1 : report = access.birthdayReport("01");
			generate(report);
			break;
			case 2 : report = access.groupContactReport();
			generate(report);
			break;
			case 3: report = access.emailContactReport();
			generate(report);
			break;
			case 4: report = access.phoneContactReport();
			generate(report);
			break;
			case 5 : report = access.groupContactConditionalReport();
			generate(report);
			break;
			case 6: break;
			}
			break;
		case 5: 
			Connection con = DbConnectionUtil.getMySqlConnection();
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		}
		}
	}

}
