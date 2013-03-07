package edu.wctc.distjava.greenproject.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class HomePageBean implements Serializable {
    
    private static final long serialVersionUID = 1L; 
    
    HomePageBean() {
        
    }
    
}
