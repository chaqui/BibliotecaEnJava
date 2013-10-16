/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.InterpreteMusica;

/**
 *
 * @author chaqui
 */
@Stateless
public class InterpreteMusicaFacade extends AbstractFacade<InterpreteMusica> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InterpreteMusicaFacade() {
        super(InterpreteMusica.class);
    }
    
}
