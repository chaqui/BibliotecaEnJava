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
@Table(name = "autorLibro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutorLibro.findAll", query = "SELECT a FROM AutorLibro a"),
    @NamedQuery(name = "AutorLibro.findByIdautorLibro", query = "SELECT a FROM AutorLibro a WHERE a.idautorLibro = :idautorLibro"),
    @NamedQuery(name = "AutorLibro.findByLibroIdlibro", query = "SELECT a FROM AutorLibro a WHERE a.libroIdlibro = :libroIdlibro"),
    @NamedQuery(name = "AutorLibro.findByInformacion", query = "SELECT a FROM AutorLibro a WHERE a.informacion = :informacion")})
public class AutorLibro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idautorLibro")
    private Integer idautorLibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "libro_idlibro")
    private int libroIdlibro;
    @Size(max = 30)
    @Column(name = "informacion")
    private String informacion;

    public AutorLibro() {
    }

    public AutorLibro(Integer idautorLibro) {
        this.idautorLibro = idautorLibro;
    }

    public AutorLibro(Integer idautorLibro, int libroIdlibro) {
        this.idautorLibro = idautorLibro;
        this.libroIdlibro = libroIdlibro;
    }

    public Integer getIdautorLibro() {
        return idautorLibro;
    }

    public void setIdautorLibro(Integer idautorLibro) {
        this.idautorLibro = idautorLibro;
    }

    public int getLibroIdlibro() {
        return libroIdlibro;
    }

    public void setLibroIdlibro(int libroIdlibro) {
        this.libroIdlibro = libroIdlibro;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idautorLibro != null ? idautorLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutorLibro)) {
            return false;
        }
        AutorLibro other = (AutorLibro) object;
        if ((this.idautorLibro == null && other.idautorLibro != null) || (this.idautorLibro != null && !this.idautorLibro.equals(other.idautorLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.AutorLibro[ idautorLibro=" + idautorLibro + " ]";
    }
    
}
