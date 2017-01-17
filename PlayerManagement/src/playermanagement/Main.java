/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playermanagement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PlayerManagementPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        Player p1 = new Player();
        p1.setId(8);
        p1.setFirstname("Xiaoyi");
        p1.setJerseynumber(30);
        p1.setLastname("Peng");
        p1.setLastspokenwords("I am in the best form");
        em.persist(p1);
        
        Team t1 = new Team();
        t1.setTeamId(4);
        t1.setTeamname("Java4women");
        t1.setLeague("Java");
        em.persist(t1);

   

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    
}
