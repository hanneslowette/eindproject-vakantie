package org.betavzw.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.betavzw.entities.Team;

/**
 * 1.2. Beheren van teams
 * Als HR-medewerker
 * wil ik gegevens van teams kunnen beheren in het systeem
 * zodat de teamgegevens in het systeem up-to-date gehouden kunnen worden en
 * teamverantwoordelijken verlofaanvragen kunnen verwerken
 * 
 * @author Hannes Lowette
 */
@Stateless public class TeamEJB {

	/**
	 * TODO: naam persistence context
	 */
	@PersistenceContext private EntityManager manager;

	/**
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Transactional private Team getTeam(int id) {
		return manager.find(Team.class, id);
	}

}