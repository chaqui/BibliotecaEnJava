/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.Pelicula;

/**
 *
 * @author chaqui
 */
@Stateless
public class PeliculaFacade extends AbstractFacade<Pelicula> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeliculaFacade() {
        super(Pelicula.class);
    }
    
}
