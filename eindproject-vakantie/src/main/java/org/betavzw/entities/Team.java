package org.betavzw.entities;

import java.util.HashSet;
import java.util.Set;

public class Team {
	
	private String naam;
	private String code;
	private Werknemer teamverantwoordelijke;
	private Set<Werknemer> teamLeden = new HashSet<Werknemer>();

	public String getNaam() {
		return naam;
	}

	public Set<Werknemer> getTeamLeden() {
		return teamLeden;
	}

	public void setTeamLeden(Set<Werknemer> teamLeden) {
		this.teamLeden = teamLeden;
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

	public void addWerknemer(Werknemer teamlid) {
		
	}
	
}
