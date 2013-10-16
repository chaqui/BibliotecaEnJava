/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.AutorLibro;

/**
 *
 * @author chaqui
 */
@Stateless
public class AutorLibroFacade extends AbstractFacade<AutorLibro> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutorLibroFacade() {
        super(AutorLibro.class);
    }
    
}
