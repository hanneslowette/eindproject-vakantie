package org.betavzw.entities;

import java.time.LocalDate;

public class CollectieveSluiting {

	private LocalDate startDatum;
	private String omschrijving;
	private boolean terugkerend;

	public LocalDate getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(LocalDate startDatum) {
		this.startDatum = startDatum;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isTerugkerend() {
		return terugkerend;
	}

	public void setTerugkerend(boolean terugkerend) {
		this.terugkerend = terugkerend;
	}

}
