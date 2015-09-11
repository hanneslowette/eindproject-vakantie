package org.betavzw.entities;

import java.time.LocalDate;

import org.betavzw.util.Toestand;

public class VerlofAanvraag {
	
	/**
	 * De start datum van de aanvraag van verlof
	 */
	private LocalDate startDatum;
	
	/**
	 * De eind datum van de aanvraag van het verlof
	 */
	private LocalDate eindDatum;
	
	/**
	 * De datum wanneer de aanvraag is geplaatst
	 */
	private LocalDate aanvraagDatum;
	
	/**
	 * De huidige toestand van de aanvraag
	 */
	private Toestand toestand;

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

	public Toestand getToestand() {
		return toestand;
	}

	public void setToestand(Toestand toestand) {
		this.toestand = toestand;
	}

	public void Goedkeuren() {
	}

	public void Afkeuren() {
	}

	public void Annuleren() {
	}

}
