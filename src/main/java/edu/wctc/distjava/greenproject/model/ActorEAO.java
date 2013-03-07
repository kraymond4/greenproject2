package edu.wctc.distjava.greenproject.model;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class ActorEAO {

    @PersistenceContext
    private EntityManager em;

    public Actor getActorById(Object id) {
        return getEm().find(Actor.class, id);
    }
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}