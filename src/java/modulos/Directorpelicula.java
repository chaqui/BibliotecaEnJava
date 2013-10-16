/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaqui
 */
@Entity
@Table(name = "directorpelicula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Directorpelicula.findAll", query = "SELECT d FROM Directorpelicula d"),
    @NamedQuery(name = "Directorpelicula.findByIddirectorpelicula", query = "SELECT d FROM Directorpelicula d WHERE d.iddirectorpelicula = :iddirectorpelicula"),
    @NamedQuery(name = "Directorpelicula.findByPeliculaIdpelicula", query = "SELECT d FROM Directorpelicula d WHERE d.peliculaIdpelicula = :peliculaIdpelicula"),
    @NamedQuery(name = "Directorpelicula.findByDescripcion", query = "SELECT d FROM Directorpelicula d WHERE d.descripcion = :descripcion")})
public class Directorpelicula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddirectorpelicula")
    private Integer iddirectorpelicula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pelicula_idpelicula")
    private int peliculaIdpelicula;
    @Size(max = 30)
    @Column(name = "descripcion")
    private String descripcion;

    public Directorpelicula() {
    }

    public Directorpelicula(Integer iddirectorpelicula) {
        this.iddirectorpelicula = iddirectorpelicula;
    }

    public Directorpelicula(Integer iddirectorpelicula, int peliculaIdpelicula) {
        this.iddirectorpelicula = iddirectorpelicula;
        this.peliculaIdpelicula = peliculaIdpelicula;
    }

    public Integer getIddirectorpelicula() {
        return iddirectorpelicula;
    }

    public void setIddirectorpelicula(Integer iddirectorpelicula) {
        this.iddirectorpelicula = iddirectorpelicula;
    }

    public int getPeliculaIdpelicula() {
        return peliculaIdpelicula;
    }

    public void setPeliculaIdpelicula(int peliculaIdpelicula) {
        this.peliculaIdpelicula = peliculaIdpelicula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirectorpelicula != null ? iddirectorpelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Directorpelicula)) {
            return false;
        }
        Directorpelicula other = (Directorpelicula) object;
        if ((this.iddirectorpelicula == null && other.iddirectorpelicula != null) || (this.iddirectorpelicula != null && !this.iddirectorpelicula.equals(other.iddirectorpelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Directorpelicula[ iddirectorpelicula=" + iddirectorpelicula + " ]";
    }
    
}
