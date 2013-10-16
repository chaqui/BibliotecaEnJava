/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.TelefonoBibliotecaria;

/**
 *
 * @author chaqui
 */
@Stateless
public class TelefonoBibliotecariaFacade extends AbstractFacade<TelefonoBibliotecaria> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TelefonoBibliotecariaFacade() {
        super(TelefonoBibliotecaria.class);
    }
    
}
