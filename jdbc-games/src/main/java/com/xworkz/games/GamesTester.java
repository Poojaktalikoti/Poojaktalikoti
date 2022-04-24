package com.xworkz.games;

import java.util.Scanner;

import com.xworkz.games.dao.GamesDAO;
import com.xworkz.games.dto.GamesDTO;

public class GamesTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter game Id");
		int id=scanner.nextInt();
		
		System.out.println("Enter game Name");
		String Name=scanner.next();
		
		System.out.print("Enter noofplayers");
		int noofplayers=scanner.nextInt();
			
		System.out.println("Enter game type");
		String gametype=scanner.next();
		
		GamesDTO dto =new GamesDTO(id,Name,noofplayers,gametype);
		
		boolean SaveStatus=GamesDAO.saveGame(dto);
		if(SaveStatus) {
			System.out.println("Save Successfully");
		}else {
			System.out.println("Save Unsuccessfully");
		}
	}
			
}
