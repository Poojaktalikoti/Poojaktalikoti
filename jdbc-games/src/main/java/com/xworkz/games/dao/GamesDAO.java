package com.xworkz.games.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.xworkz.games.dbconstants.GamesConstant;
import com.xworkz.games.dto.GamesDTO;

public class GamesDAO {
	
	public static Connection getConnection()throws Exception{
	
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/feb10";
		String username="root";
		String password="Root";
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
	public static boolean saveGame(GamesDTO dto) {
		if (dto ==null){
			return false;
		}else {
			Connection connection = null;
			PreparedStatement preparedStatement=null;
			
try {
	connection=DriverManager.getConnection(JDBCURL,USERNAME,PASSWORD);
	preparedStatement=connection.prepareStatement("INSERT INTO games Values(?,?,?,?)");
	
            preparedStatement.setInt(1,dto.getGameid());
			preparedStatement.setString(2,dto.getGameName());
			preparedStatement.setInt(3,dto.getNoOfPlayers());
			preparedStatement.setString(4,dto.getGameType());
			
			preparedStatement.execute();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement !=null)
					preparedStatement.close();
				if(connection !=null)
					connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			}
		
		}
		
return false;
	}
}
