package edu.wctc.distjava.greenproject.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.Actor;
import model.ActorEAO;

/**
 * A sample JSF Managed Bean
 * @author  jlombardo
 * @version 1.00
 */
@Named
@ManagedBean(name = "sample")
@SessionScoped
public class SampleBean implements Serializable {
    // Incremement this with each structural class change
    private static final long serialVersionUID = 1L;
    
    private String message = "Hello From JSF Managed Bean";
    @Inject
    private ActorEAO eao;
    
    public Actor getActorById(String id){
        return eao.getActorById(new Short(id));
    }
    
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
    
    
}
