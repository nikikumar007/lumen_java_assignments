package com.example.demo;

import com.example.demo.services.FileService;

public class FileReaderThread implements Runnable {

	FileService service;
 public FileReaderThread() {
	// TODO Auto-generated constructor stub
	 Thread thread = new Thread(this);
		thread.start();
}

	@Override
	public void run() {
		this.service.readFromFile();
		
	}

}
