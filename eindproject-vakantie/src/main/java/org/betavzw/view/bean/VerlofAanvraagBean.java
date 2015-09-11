package org.betavzw.view.bean;

import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.betavzw.entities.VerlofAanvraag;

@Named("verlofAanvraag")
@SessionScoped
public class VerlofAanvraagBean {

	@EJB
	private VerlofAanvraag verlofAanvraag;
	private Date startDatum;
	private Date eindDatum;

	public VerlofAanvraag getVerlofAanvraag() {
		return verlofAanvraag;
	}

	public void setVerlofAanvraag(VerlofAanvraag verlofAanvraag) {
		this.verlofAanvraag = verlofAanvraag;
	}

	public Date getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
	}

	public Date getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(Date eindDatum) {
		if (startDatum.before(eindDatum)) {
			this.eindDatum = eindDatum;
		}
	}

	public String verstuur() {
		return "home.xhtml";
	}
}
