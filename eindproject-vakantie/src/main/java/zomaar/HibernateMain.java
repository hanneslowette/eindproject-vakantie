package zomaar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("OefQueriesPU");
		
		EntityManager em = emf.createEntityManager();

		
		em.close();
		emf.close();
		
	}

}
