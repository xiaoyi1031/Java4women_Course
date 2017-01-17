/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guest;

import javax.ejb.Stateless;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
//import javax.persistence.TypedQuery

/**
 *
 * @author User
 */
@Stateless
public class GuestDao {

    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest: 
    public void persist(Guest guest) {
        em.persist(guest);
    }
 
    // Retrieves all the guests:
    public List<Guest> getAllGuests() {
        TypedQuery<Guest> query = em.createQuery(
            "SELECT g FROM Guest g ORDER BY g.id", Guest.class);
        return query.getResultList();
    }
}
