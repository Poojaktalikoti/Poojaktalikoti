package com.xworkz.Hospitalapp.hospital;

import com.xworkz.Hospitalapp.dto.PatientDetailsDTO;
import com.xworkz.Hospitalapp.constant.Gender;

public class Hospital {// one to many bcoz we can add more elements
	public PatientDetailsDTO patientDTO[];
	int index;
	
	public Hospital(int size) {//constructor
		patientDTO = new PatientDetailsDTO[size];
	}
	public boolean createPatientDetails(PatientDetailsDTO dto) {
		System.out.println("invoking  createPatientDetails()");
		boolean patientAdded=false;
		if (dto != null) {
			patientDTO[index++] =dto;
			patientAdded=true;
		}
		else {
			System.out.println("no patient found");
		}
		System.out.println("end of  createPatientDetails");
		return patientAdded;
	}
	//getAllpatientDetails(){
	public void getAllpatientDetails() {
		System.out.println("inside getpatientDetails()....fetchingthe data");
		for(int i = 0; i< patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
		}
		System.out.println("end of getPatientDetails()");
	}
	public void getPatientById(int PatientId) {
	System.out.println("inside getpatientId()");
	System.out.println("age 1 PatientId : "+PatientId);
	
	for(int i =0; i<patientDTO.length;i++) {
	if(patientDTO[i].getpatientId()==PatientId) {
	System.out.println("patient id :"+ patientDTO[i].getpatientId());
	}
	else{
		System.out.println("patient id: "+PatientId +"is not avaliable");
	}
	}
	return;
	}
	
	
	public  String getaddressByName(String patientName) {
		System.out.println("inside getPatientIdByName()..");
		for(int i= 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getpatientName().equals(patientName)) {
				System.out.println("patient name:" + patientDTO[i].getpatientId()+","+
				"patient address: "+patientDTO[i].getaddress());
			}
			else {
				System.out.println("patient id: "+patientName+" is not available");
			}
		}
		
	return patientName;
	}
	
	
	public Gender getPatientGenderByName(Gender patientGender) {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if((patientDTO[i]).getGender()==patientGender) {
				System.out.println("patient gender : " + patientDTO[i].getgender());
			}
			else {
				System.out.println("patient gender :" + patientGender+" is not available");
			}
		}
		return patientGender;
	}

		public int getPatientAgeByName(int patientAge) {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getContactNumber()==patientAge) {
				System.out.println("patient gender : " + patientDTO[i].getAge());
			}
			else {
				System.out.println("patient gender :" + patientAge+" is not available");
			}
		}
		return patientAge;
	}

	public String getPatientContactNumberByName(String patientName, long PatientName) {
		System.out.println("inside getPatientByGender()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getContactNumber()==PatientName) {
				System.out.println("patient gender : " + patientDTO[i].getContactNumber());
			}
			else {
				System.out.println("patient gender :" + patientName+" is not available");
			}
		}
		return patientName;
	}

	public int getPatientNameById(int patientId) {
		System.out.println("inside getPatientIdByName()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getpatientId()==patientId) {
				System.out.println("patient id:"+patientDTO[i].getpatientId() + "," + "patient name:"+patientDTO[i].getpatientName());
			}
			else {
					System.out.println("patient id :"+patientId+" is not available");
			}
		}
		return patientId;
	}

	
	public long getPatientIdByName(long patientName) {
		System.out.println("inside getPatientIdByName()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getpatientName().equals(patientName)) {
				System.out.println("patient name:"+patientDTO[i].getpatientName() + "," + "patient ID:"+patientDTO[i].getpatientId());
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		return patientName;
	}

	public Gender getGenderByName(String patientName, Gender gender) {
		System.out.println("inside getPatientIdByName()..");
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getpatientName().equals(patientName)) {
				System.out.println("patient name:"+patientDTO[i].getpatientName()+ "," +"patient address:"+patientDTO[i].getGender() );
			}
			else {
					System.out.println("patient id :"+patientName+" is not available");
			}
		}
		return gender;
	}
	
	
	public boolean updateContactNoBypatientName(long contactNo,String patientName) {
	
		System.out.println("invoked updateContactNoBypatientName()");
		System.out.println("1st arg : contactno:" + contactNo);
		boolean isContactNoUpdated=false;
		System.out.println("2nd arg :patient name : "+patientName);
		for (int i=0; i< patientDTO.length; i++) {
		if(patientDTO[i].getpatientName().equals(patientName)) {
				patientDTO[i].setContactNumber(contactNo);
				isContactNoUpdated=true;
			}
			else {
				System.out.println("contact number is not updated");
			}
			
		}
		return isContactNoUpdated;
	}
	public void getPatientNameById(String next) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

