package edu.wctc.distjava.greenproject.controller;

import edu.wctc.distjava.greenproject.utils.BitSaleConstants;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ManagedProperty(value="#{param.pageId}")
    private String pageId;
    
    public String moveToHomePage() {
        return BitSaleConstants.homePage;
    }
    
    public String showPage() {
        if (pageId == null) {
            return BitSaleConstants.homePage;
        }
        return BitSaleConstants.homePage;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
}
