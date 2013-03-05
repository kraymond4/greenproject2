package edu.wctc.distjava.greenproject.model;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Chuck
 */
@Named
@Stateless
public class ActorEAO {
    @PersistenceContext(unitName = "greenproject2PU")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public Actor getActorById(Object id) {
        return getEm().find(Actor.class, id);
    }
}
