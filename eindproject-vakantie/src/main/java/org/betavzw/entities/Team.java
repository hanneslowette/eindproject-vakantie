package org.betavzw.entities;

public class Team {
	
	private String naam;
	private String code;
	private Werknemer teamverantwoordelijke;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Werknemer getTeamverantwoordelijke() {
		return teamverantwoordelijke;
	}

	public void setTeamverantwoordelijke(Werknemer teamverantwoordelijke) {
		this.teamverantwoordelijke = teamverantwoordelijke;
	}

	
	
}
