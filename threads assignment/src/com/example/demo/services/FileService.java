package com.example.demo.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	private String[] txt;

public void writeToFile(String[] array)
{
	try (PrintWriter writer=new PrintWriter(new FileWriter("inputFile.txt",true))){
		writer.println(array);
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public  void readFromFile()
{
try {
	int i = 0;
	BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Neema\\Desktop\\tff\\input.txt")));
	String buffer = null;
	while ((buffer = br.readLine()) != null) {
		txt[i] = buffer;
		i++;
	}
} catch (Exception e) {

	e.printStackTrace();
}
}
}
