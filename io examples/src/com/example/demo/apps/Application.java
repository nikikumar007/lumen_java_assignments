package com.example.demo.apps;

import java.io.File;

import com.example.demo.Professor;
import com.example.demo.services.ProfessorService;

public class Application {
public static void main(String[] args)
{
	
	File file=new File("professor.ser");
	
	File textFile=new File("professor.txt");
	Professor prof1=new Professor("Niki", "ISE", "phd");
	Professor prof2=new Professor("Ram", "CSE", "phd");
	Professor prof3=new Professor("Sham", "ECE", "phd");
	Professor[] profs=new Professor[3];
	ProfessorService service=new ProfessorService();
	profs[0]=prof1;
	profs[1]=prof2;
	profs[2]=prof3;
	int key=4;
	if(key==1)
	{
	boolean result=service.writeObjectToFile(profs, file);
	if(result)
	{
		int i;
		for(i=0;i<3;i++)
			System.out.println("serialised prof "+profs[i].getQualification());
		System.out.println("One Object Serialised");
	}
	else
	{
		System.out.println("Check Exception");
	}
	}
	 if(key==2)
	{
		 int i;
		
		for(i=0;i<3;i++)
		System.out.println("Deserialised prof "+profs[i]);
	}
	 if(key==3)
	 {
		 Professor suresh=new Professor("Suresh", "ISE", "phd");
			Professor ramesh=new Professor("Manish", "CSE", "phd");
			Professor ram=new Professor("Ram", "CSE", "phd");
			Professor sham=new Professor("Sham", "CSE", "phd");
			Professor gopi=new Professor("Gopi", "CSE", "phd");
		System.out.println("Is added: " +service.writeTotextFile(suresh, textFile));
		System.out.println("Is added: " +service.writeTotextFile(ramesh, textFile));
		System.out.println("Is added: " +service.writeTotextFile(ram, textFile));
		System.out.println("Is added: " +service.writeTotextFile(sham, textFile));
		System.out.println("Is added: " +service.writeTotextFile(gopi, textFile));
	 }
	 if(key==4)
	 {
		 Professor list[]=service.readFromTextFile(textFile);
		 for(Professor eachProf:list)
		 {
			 System.out.println(eachProf);
		 }
	 }
}

}
