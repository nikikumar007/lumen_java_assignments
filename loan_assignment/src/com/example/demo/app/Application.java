package com.example.demo.app;

import com.example.demo.HousingLoan;

public class Application {
	public static void main(String[] args) {
		HousingLoan houseLoan1 = new HousingLoan(10000, 2, 300, "Duplex");
		HousingLoan houseLoan2 = new HousingLoan(50000, 5, 800, "Duplex");
		HousingLoan[] list1 = { houseLoan1, houseLoan2 };
		Display display = new Display();
		display.printHouseLoan(list1);
	}
}