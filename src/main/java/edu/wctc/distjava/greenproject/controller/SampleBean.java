package edu.wctc.distjava.greenproject.controller;

import edu.wctc.distjava.greenproject.model.Actor;
import edu.wctc.distjava.greenproject.model.ActorEAO;
import java.io.Serializable;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

/**
 * A sample JSF Managed Bean
 * @author  jlombardo
 * @version 1.00
 */
@Named
@Scope("session")
public class SampleBean implements Serializable {
    // Incremement this with each structural class change
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private ActorEAO eao;
    
    private String message = "Hello From JSF Named Bean";

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
    
    public Actor getActorById(String id) {
        return eao.getActorById(new Short(id));
    }    
    
}
