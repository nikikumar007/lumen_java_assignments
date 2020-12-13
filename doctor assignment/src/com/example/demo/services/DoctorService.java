package com.example.demo.services;

import java.util.HashMap;
import java.util.List;

import com.example.demo.Patient;

public class DoctorService {
	HashMap<String, List<Patient>> map = new HashMap<>();

	public void addDoctor(String name, List<Patient> list) {
		if (map.containsKey(name)) {
			List<Patient> existingList = map.get(name);
			existingList.addAll(list);
			map.put(name, existingList);
		} else {
			map.put(name, list);
		}
	}

	public void getPatients(String name) {
		if (!map.containsKey(name))
			System.out.println("No Doctor Found");
		else
		System.out.println(map.get(name));
	}

	public void checkDoctor(String docname, String patientName) {
		if (map.containsKey(docname)) {
			List<Patient> patients = map.get(docname);
		//	int patientSize = patients.size();
			for (int i = 0; i < patients.size(); i++) {
//System.out.println(patients.get(i).getName());
				if (patients.get(i).getName().equalsIgnoreCase(patientName)) {
					patients.remove(i);
					
					System.out.println("Patient Removed Successfully");
					break;
				}
			}
			map.put(docname, patients);
		}

		else {
			System.out.println("No Doctor Found");
		}

	}
}
