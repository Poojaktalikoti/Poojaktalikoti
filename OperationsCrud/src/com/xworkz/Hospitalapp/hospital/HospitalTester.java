package com.xworkz.Hospitalapp.hospital;

import java.util.Scanner;

import com.xworkz.Hospitalapp.constant.Gender;
import com.xworkz.Hospitalapp.dto.PatientDetailsDTO;


public class HospitalTester {
	private static final Gender male = null;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scanner.nextInt();
		
//		int size=scanner.nextInt();
//		or
		
		Hospital hospital=new Hospital(size);
		
	for(int i=0;i<size;i++) {
			
			PatientDetailsDTO dto=new PatientDetailsDTO();
			
			System.out.println("enter a patient id");
			dto.setPatientId(scanner.nextInt());
			
			System.out.println("enter a name ");
			dto.setpatientName(scanner.next());
			
			System.out.println("enter a adress");
			dto.setaddress(scanner.next());
			
			System.out.println("enter a age");
			dto.setAge(scanner.nextInt());
			
			System.out.println("enetr a disease");
			dto.setDisease(scanner.next());
			
			System.out.println("enter a number");
			dto.setContactNumber(scanner.nextLong());
			
			System.out.println("enter a gender");
			String gender = scanner.next();
			dto.setGender(gender.valueOf(gender));
				
			System.out.println(hospital.createPatientDetails(dto));
			
	
	
	  //accesing all details System.out.println(); hospital.getAllpatientDetails();
	  
	  System.out.println();
	  
	  //access only id System.out.println("serach for available ID");
	  Hospital.getpatientId(scanner.nextInt());
	  
	  
	  
	  System.out.println();
	  
	  //access only gender System.out.println("search for Patient gender"); String
	  gender=scanner.next(); hospital.getPatientGender(Gender.valueOf(gender));
	  
	  System.out.println();
	  
	  //acces only contact System.out.println("search for contact number");
	  hospital.getPatientContact(scanner.nextLong());
	  
	  System.out.println();
	  
	  //access only age System.out.println("search for age");
	  hospital.getPatientAge(scanner.nextInt());
	  
	  System.out.println();
	  
	  //access only patient id by name System.out.println("search for ID by Name");
	  hospital.getPatientIdByName(scanner.next());
	  
	  
	  System.out.println("search for patient name by id");
	  hospital.getPatientNameById(scanner.nextInt());
	  
	  
	  System.out.println();
	  System.out.println("search for patient address by name");
	  hospital.getaddressByName(scanner.next());
	 
	
	System.out.println();
	System.out.println("search for patient gender by name");
	hospital.getGenderByName(scanner.next());

}

		
		
		
	}


}

