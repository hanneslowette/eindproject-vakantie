package org.betavzw.entities;

import java.time.LocalDate;

public class VerlofAanvraag {
	private LocalDate startDatum;
	private LocalDate eindDatum;
	private LocalDate aanvraagDatum;
	private int toestand;

	public LocalDate getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(LocalDate startDatum) {
		this.startDatum = startDatum;
	}

	public LocalDate getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(LocalDate eindDatum) {
		this.eindDatum = eindDatum;
	}

	public LocalDate getAanvraagDatum() {
		return aanvraagDatum;
	}

	public void setAanvraagDatum(LocalDate aanvraagDatum) {
		this.aanvraagDatum = aanvraagDatum;
	}

	public int getToestand() {
		return toestand;
	}

	public void setToestand(int toestand) {
		this.toestand = toestand;
	}

	public void Goedkeuren() {
	}

	public void Afkeuren() {
	}

	public void Annuleren() {
	}

}
