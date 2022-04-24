package com.xworkz.games.dto;

public class GamesDTO {
	
	private int gameId;
	private String gameName;
	private int noOfPlayers;
	private String gameType;
	
	public GamesDTO() {
	}
	public GamesDTO(int gameid, String gameName, int noOfPlayers, String gameType) {
		super();
		this.gameId = gameid;
		this.gameName = gameName;
		this.noOfPlayers = noOfPlayers;
		this.gameType = gameType;
	}
	public int getGameid() {
		return gameId;
	}
	public void setGameid(int gameid) {
		this.gameId = gameid;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	
	

}
