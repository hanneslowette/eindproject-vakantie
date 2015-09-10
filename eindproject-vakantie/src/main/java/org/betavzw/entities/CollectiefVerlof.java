package org.betavzw.entities;

import java.time.LocalDate;

public class CollectiefVerlof extends CollectieveSluiting {
	
	private LocalDate eindDatum;

	public LocalDate getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(LocalDate eindDatum) {
		this.eindDatum = eindDatum;
	}
}
