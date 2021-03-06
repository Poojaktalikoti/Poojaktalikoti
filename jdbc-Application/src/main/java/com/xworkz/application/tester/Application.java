package com.xworkz.application.tester;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Application {


	public static void main(String[] args) throws Exception {
		String query ="INSERT INTO application(application_name) values(?)";
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost/feb10","root,","ROOT");
			
			System.out.println("Connection established");
			 
			statement=connection.prepareStatement(query);
			
			statement.setString(1,"application_name");
			
			FileReader reader=new FileReader(
					"C:\\Users\\BASAVA-COMP\\Eclipse16\\value\\Project\\protecter\\Notebook\\jdbc\\application.txt");
				
			statement.setCharacterStream(1, reader);
					
			statement.execute();
			
			System.out.println("Data inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
				if(connection!=null)
					connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
}
}