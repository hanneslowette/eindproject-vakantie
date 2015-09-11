package zomaar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.betavzw.entities.Werknemer;

public class HibernateMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("OefQueriesPU");
		
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Werknemer koen = new Werknemer();
		koen.setNaam("Voornaam");
		koen.setVoornaam("Koen");
		
		
		em.close();
		emf.close();
		
	}

}
