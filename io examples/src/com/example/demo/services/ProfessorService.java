package com.example.demo.services;
import java.io.*;
import java.util.Arrays;

import com.example.demo.*;
public class ProfessorService {
	public boolean writeTotextFile(Professor prof,File file)
	{
		boolean result=false;
		try (PrintWriter writer=new PrintWriter(new FileWriter(file,true))){
			writer.println(prof);
			result=true;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	
	}
	
	public Professor[] readFromTextFile(File file)
	{
		int i=0;
		Professor[] list=new Professor[4];
		String line=null;
		try(BufferedReader reader=new BufferedReader(new FileReader(file))) {
			
			while((line=reader.readLine())!=null)
			{
			String[] values=line.split(",");
			Professor prof= new Professor(values[0],values[1],values[2]);
			list[i]=prof;
			i++;
		if(i==list.length)
			{
				list= Arrays.copyOf(list,i+1);
			}
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public boolean writeObjectToFile(Professor [] profs,File file)
	{
		boolean result=false;
		try (ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream (file))){
			
			outputStream.writeObject(profs);
			result=true;
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	
	}
	public Object readObjectFromFile(File file)
	{
		Object obj=null;
		try (ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(file))){
			obj=inputStream.readObject();
			
		} catch (ClassNotFoundException|IOException e) {
			e.printStackTrace();
		}
		return obj;
	
	}
}
