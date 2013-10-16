/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modulos.CdMusica;

/**
 *
 * @author chaqui
 */
@Stateless
public class CdMusicaFacade extends AbstractFacade<CdMusica> {
    @PersistenceContext(unitName = "BibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CdMusicaFacade() {
        super(CdMusica.class);
    }
    
}
