package com.xworkz.jdbcdemo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Runner {

	private static Object statement1;
	public static void main(String[] args) {
		insertDoctor();
		UpdateDoctor();
		deleteDoctor();
		
		private static void insertDoctor() {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter nurse");
			int nurse=sc.nextInt();
			System.out.println("enter workers");
			int workers=sc.nextInt();
			
			sc.close();
		
		Connection connection = null;
		Statement statement = null;
	
		//step 1
		// load and register the driver
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded");
			
			//step 2
			// Create Establish connection with MYSQL Server 
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","root");
	System.out.println("connection created");
	
	//step 3
	//create platform/environment to execute the queries
	 statement1 = connection.createStatement();
	System.out.println("Statement created");
	
	//step 4
	//execute the query
	statement1.execute("INSERT INTO doctor values(id,name,nurse,workers) values ("+id+",'"+name+"',"+nurse+","+workers+")");
	System.out.println("Successfully inserted");

	} catch (Exception e) {
		e.printStackTrace();
	}finally {
			//step 6
			//close the costly resources
			try {
				if(statement1 !=null)
					statement.close();
				if(connection !=null)
					connection.close();
				
			}catch (SQLException e2) {
				e2.printStackTrace();
			}
	}
		}
		private static void updatedoctor() {
			Scanner sc1=new Scanner(System.in);
			
			System.out.println("enter doctor name to update");
			String name=sc1.next();
			
			System.out.println("enter number of nurse to update");
			int nurse=sc1.nextInt();
			
			System.out.println("enter number of workers to update");
			int workers=sc1.nextInt();
			
			System.out.println("enter id value to all the detils");
			int id=sc1.nextInt();
			
			Connection connection=null;
			Statement statement=null;
			
		try {	
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","root");
				System.out.println("connection created");
				
	
		statement = connection.createStatement();
		System.out.println("Statement created");
				
			
	statement.execute("UPDATE Doctor values to SET name=('"+name"'),nurse=("+nurse+"),workers=("+workers+")Where id=("+id+")");
	System.out.println("Successfully updated");
	
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement !=null)
					statement.close();
				if(connection !=null)
					connection.close();
				
			}catch (Exception e2) {
				e2.printStackTrace();
			}
	}
				}
		private static void deleteDoctor() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter id to delete all details");
			int id=sc.nextInt();
			
			Connection connection=null;
			Statement statement = null;
		try {	
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","root");
	System.out.println("connection created");

	 statement = connection.createStatement();
	System.out.println("Statement created");
	
	statement.execute("DELETE FROM doctor where id=("+id+")");
	System.out.println("Successfully deleted");
	
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			
			try {
				if(statement !=null)
					statement.close();
				if(connection !=null)
					connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		}
	}