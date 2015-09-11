package org.betavzw.view.bean;

import java.io.Serializable;
import java.time.ZoneId;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.betavzw.ejb.VerlofAanvraagEJB;

@Named("verlofGoedkeuren")
@SessionScoped
public class VerlofGoedkeurenIO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private VerlofAanvraagEJB verlofAanvraagEJB;
	private String keuring;

	public String getKeuring() {
		return keuring;
	}

	public void setKeuring(String keuring) {
		this.keuring = keuring;
	}

	public Date getStartDatum() {
		return Date.from(verlofAanvraagEJB.getStartDatum().atStartOfDay()
				.atZone(ZoneId.systemDefault()).toInstant());
	}

	public Date getEindDatum() {
		return Date.from(verlofAanvraagEJB.getEindDatum().atStartOfDay()
				.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String getVoornaam() {
		return "";
	}

	public String getNaam() {
		return "";
	}

	public int getPersoneelsNr() {
		return 0;
	}

	public String verstuur() {
		if (keuring.equalsIgnoreCase("accept")) {
			verlofAanvraagEJB.goedkeuren();
		} else if (keuring.equalsIgnoreCase("reject")) {
			verlofAanvraagEJB.afkeuren();
		} else if (keuring.equalsIgnoreCase("cancel")) {
			verlofAanvraagEJB.annuleren();
		}
		return "home";
	}
}
