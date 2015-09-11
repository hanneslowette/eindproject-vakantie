package org.betavzw.view.bean;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.betavzw.entities.VerlofAanvraag;

@Named("verlofAanvraag")
@SessionScoped
public class VerlofAanvraagBean {

	@EJB
	private VerlofAanvraag verlofAanvraag;	
	
	public String verstuur() {
		return "verlofaanvraag.xhtml";
	}
}
