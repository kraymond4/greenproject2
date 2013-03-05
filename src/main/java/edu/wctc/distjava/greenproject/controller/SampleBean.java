package edu.wctc.distjava.greenproject.controller;

import edu.wctc.distjava.greenproject.model.Actor;
import edu.wctc.distjava.greenproject.model.ActorEAO;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * A sample JSF Managed Bean
 * @author  jlombardo
 * @version 1.00
 */
@Named
@SessionScoped
public class SampleBean implements Serializable {
    // Incremement this with each structural class change
    private static final long serialVersionUID = 1L;
    
    private String message = "Hello From JSF Managed Bean";
    @Inject
    private ActorEAO eao;
    
    /**
     * Creates a new instance of SampleBean
     */
    public SampleBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public Actor getActorById(String id){
        return eao.getActorById(new Short(id));
    }
    
}
