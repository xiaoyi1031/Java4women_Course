/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Prdouctorder;

/**
 *
 * @author User
 */
@Stateless
public class PrdouctorderFacade extends AbstractFacade<Prdouctorder> {

    @PersistenceContext(unitName = "shoppingSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrdouctorderFacade() {
        super(Prdouctorder.class);
    }
    
}
