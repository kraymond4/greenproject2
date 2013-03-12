package edu.wctc.distjava.greenproject.model;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
@Transactional(readOnly=true)
public class ActorEAO {

    @PersistenceContext
    private EntityManager em;

    public Actor getActorById(Object id) {
        return getEm().find(Actor.class, id);
    }
    
//    @Transactional(readOnly = false, rollbackFor = Exception.class)
//    public void delete() {}
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}