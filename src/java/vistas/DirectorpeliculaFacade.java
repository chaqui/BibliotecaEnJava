/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.Directorpelicula;

/**
 *
 * @author chaqui
 */
@Stateless
public class DirectorpeliculaFacade extends AbstractFacade<Directorpelicula> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DirectorpeliculaFacade() {
        super(Directorpelicula.class);
    }
    
}
