package com.xworkz.Hospitalapp.dto;

import com.xworkz.Hospitalapp.constant.Gender;

public class PatientDetailsDTO {
		private int patientId;
		private String address;
		 private String gender;
		 private int age;
		 private String Disease;
		 private long contactNumber;
		private String patientName;
	
		

	public PatientDetailsDTO() {
	}
	public int getpatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
		public  String getaddress() {
			return address;
		}
		public void setaddress(String address) {
			this.address = address;
		}
		public String getgender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int Age) {
			this.age =age;
		}
		public String getDisease() {
			return Disease;
		}
		public void setDisease(String Disease) {
			this.Disease =Disease;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long ContactNumber) {
			this.contactNumber=ContactNumber;
		}
		public String getpatientName() {
			return patientName;
		}
		public void setpatientName(String patientName) {
			this.patientName = patientName;
		}
		@Override
		public String toString() {
			return "PatientDetailsDTO [patientId=" + patientId + ", address=" + address + ", gender=" + gender
					+ ", age=" + age + ", Disease=" + Disease + ", contactNumber=" + contactNumber + ", patientName="
					+ patientName + "]";
		}
		public Gender getGender() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
			
		
	
	
		
	
	


}
