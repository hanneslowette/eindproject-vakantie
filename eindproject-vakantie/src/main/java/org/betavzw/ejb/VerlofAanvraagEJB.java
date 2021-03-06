package org.betavzw.ejb;

import java.time.LocalDate;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.betavzw.entities.VerlofAanvraag;
import org.betavzw.entities.Werknemer;
import org.betavzw.util.Toestand;

/**
 * Session Bean implementation class VerlofAanvraagEJB
 */
@Stateless
@LocalBean
public class VerlofAanvraagEJB implements VerlofAanvraagEJBLocal {

	@PersistenceContext(name = "unitName")
	private EntityManager manager;

	/**
	 * Default constructor.
	 */
	public VerlofAanvraagEJB() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public VerlofAanvraag verlofAanmaken(VerlofAanvraag verlofAanvraag) {
		manager.persist(verlofAanvraag);
		return verlofAanvraag;
	}

	// public VerlofAanvraag aanmaken(LocalDate startDatum, LocalDate eindDatum,
	// LocalDate aanvraagDatum) {
	// VerlofAanvraag verlofAanvraag = new VerlofAanvraag();
	// verlofAanvraag.setStartDatum(startDatum);
	// verlofAanvraag.setEindDatum(eindDatum);
	// verlofAanvraag.setAanvraagDatum(aanvraagDatum);
	// return this.verlofAanmaken(verlofAanvraag);
	// }
	//
	// public VerlofAanvraag aanmaken(LocalDate startDatum, LocalDate eindDatum,
	// LocalDate aanvraagDatum, Werknemer werknemer) {
	// VerlofAanvraag verlofAanvraag = new VerlofAanvraag();
	// verlofAanvraag.setStartDatum(startDatum);
	// verlofAanvraag.setEindDatum(eindDatum);
	// verlofAanvraag.setAanvraagDatum(aanvraagDatum);
	// verlofAanvraag.setWerknemer(werknemer);
	// return this.verlofAanmaken(verlofAanvraag);
	// }

	public VerlofAanvraag aanmaken(LocalDate startDatum, LocalDate eindDatum,
			LocalDate aanvraagDatum, Toestand toestand, Werknemer werknemer) {
		VerlofAanvraag verlofAanvraag = new VerlofAanvraag();
		verlofAanvraag.setStartDatum(startDatum);
		verlofAanvraag.setEindDatum(eindDatum);
		verlofAanvraag.setAanvraagDatum(aanvraagDatum);
		verlofAanvraag.setToestand(toestand);
		verlofAanvraag.setWerknemer(werknemer);
		return this.verlofAanmaken(verlofAanvraag);
	}

	@Transactional
	public VerlofAanvraag get(int id) {
		return manager.find(VerlofAanvraag.class, id);
	}

	public Toestand getToestand() {
		VerlofAanvraag verlofAanvraag = manager
				.find(VerlofAanvraag.class, this);
		return verlofAanvraag.getToestand();
	}

	public LocalDate getStartDatum() {
		VerlofAanvraag verlofAanvraag = manager
				.find(VerlofAanvraag.class, this);
		return verlofAanvraag.getStartDatum();
	}

	public LocalDate getEindDatum() {
		VerlofAanvraag verlofAanvraag = manager
				.find(VerlofAanvraag.class, this);
		return verlofAanvraag.getEindDatum();
	}
	
	public void goedkeuren() {
		// TODO Auto-generated method stub

	}

	public void annuleren() {
		// TODO Auto-generated method stub

	}

	public void afkeuren() {
		// TODO Auto-generated method stub

	}

}
