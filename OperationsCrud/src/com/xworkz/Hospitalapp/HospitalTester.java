package com.xworkz.Hospitalapp;

import java.util.Scanner;

import com.xworkz.Hospitalapp.PatientDto.PatientDetailsDTO;
import com.xworkz.Hospitalapp.constant.Gender;
import com.xworkz.Hospitalapp.hospital.hospital;
import com.xworkz.Hospitalapp.hospital.impl.HospitalImpl;



public class HospitalTester {
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
			dto.setGender(Gender.valueOf(gender));
				
			System.out.println(hospital.createPatientDetails(dto));
	}		
	do {
	System.out.println("enter 1 to get all the patient details");
	System.out.println("enter 2 to get the patient Details by patientid ");
	System.out.println("enter 3 to get all the patient details by patientgender");
	System.out.println("enter 4 to get all the patient details by patientcontact");
	System.out.println("enter 5 to get all the patient details by patientage");
	System.out.println("enter 6 to get all the patient details by patientname");
	System.out.println("enter 7 to get all the patient gender by patientname ");
	System.out.println("enter 8 to get all the patient id by name");
	System.out.println("enter 9 to update patient contact no by patient name");
	System.out.println("enter 10 to delete patient details by patient name");
    int choice = scanner.nextInt();
    switch (choice){
	case 1 :System.out.println("getting all patient details");
	hospital.getAllpatientDetails();
	break;
	case 2 :System.out.println("enter id to get patient details");
	hospital.getPatientById(scanner.nextInt());
	break;
	case 3:System.out.println("enter patientgender to get patientdetails");
	String gender1=scanner.next();
	hospital.getPatientNameById(Gender.valueOf(gender1));
	break;
	case 4 :System.out.println("enter patientcontact number to get patientdetails");
	hospital.getpatientbycontact(scanner.nextLong());
	break;
	case 5 :System.out.println("enter patientage to get patientdetils");
	hospital.getpatientbyage(scanner.nextInt());
	break;
	case 6 : System.out.println("enter patient name by to get patientdetails ");
	hospital.getPatientIdByName(scanner.next());
	break;
	case 7 : System.out.println("enter id to get patientname");
	hospital.getPatientNameById(scanner.nextInt());
	break;
	case 8 : System.out.println("enter patient name to get patient gender");
	hospital.getGenderByName(scanner.next());
	break;
	case 9 : System.out.println("update patientcontactnumber by enterpatientname and patientcontactnumber");
	hospital.updateContactNoBypatientName(scanner.nextInt(),scanner.nextLong());
	break;
	case 10 :System.out.println("delete patient details by entering patient name");
	hospital.deletePatientDetails(scanner.next());
	break;
	default:System.out.println("enter correct choice");
    }
    System.out.println("do you want to continue type yes / no");
    text=scanner.next();
	}
     while(text.equalsIgnorecase("yes"));
	scanner.close();
    	
}
}
		
		
		
		
	}
	}

