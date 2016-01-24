/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Cure;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author devest
 */
@Stateless
public class CureFacade extends AbstractFacade<Cure> {

    @PersistenceContext(unitName = "JSFPrimefacesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CureFacade() {
        super(Cure.class);
    }
    
}
