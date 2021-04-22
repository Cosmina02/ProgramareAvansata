package compulsory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Management {
        private static Management manager=null;
        private static EntityManagerFactory factory;
        private static EntityManager em;

        Management(){
            factory = Persistence.createEntityManagerFactory( "default" );
            em = factory.createEntityManager();
        }

    public static EntityManager getEm() {
        return em;
    }

    public static Management getInstance(){
            if(manager==null) {
                manager=new Management();
            }
            return manager;
        }

        public void close(){
            em.close();
            factory.close();
        }

}
