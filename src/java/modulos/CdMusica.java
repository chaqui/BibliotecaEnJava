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
@Table(name = "cdMusica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CdMusica.findAll", query = "SELECT c FROM CdMusica c"),
    @NamedQuery(name = "CdMusica.findByIdcdMusica", query = "SELECT c FROM CdMusica c WHERE c.idcdMusica = :idcdMusica"),
    @NamedQuery(name = "CdMusica.findByArticuloidArticulo", query = "SELECT c FROM CdMusica c WHERE c.articuloidArticulo = :articuloidArticulo"),
    @NamedQuery(name = "CdMusica.findByGenero", query = "SELECT c FROM CdMusica c WHERE c.genero = :genero"),
    @NamedQuery(name = "CdMusica.findByPais", query = "SELECT c FROM CdMusica c WHERE c.pais = :pais"),
    @NamedQuery(name = "CdMusica.findByA\u00f1o", query = "SELECT c FROM CdMusica c WHERE c.a\u00f1o = :a\u00f1o"),
    @NamedQuery(name = "CdMusica.findByNoPistas", query = "SELECT c FROM CdMusica c WHERE c.noPistas = :noPistas")})
public class CdMusica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcdMusica")
    private Integer idcdMusica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Articulo_idArticulo")
    private int articuloidArticulo;
    @Size(max = 30)
    @Column(name = "genero")
    private String genero;
    @Size(max = 30)
    @Column(name = "pais")
    private String pais;
    @Column(name = "a\u00f1o")
    private Integer año;
    @Column(name = "noPistas")
    private Integer noPistas;

    public CdMusica() {
    }

    public CdMusica(Integer idcdMusica) {
        this.idcdMusica = idcdMusica;
    }

    public CdMusica(Integer idcdMusica, int articuloidArticulo) {
        this.idcdMusica = idcdMusica;
        this.articuloidArticulo = articuloidArticulo;
    }

    public Integer getIdcdMusica() {
        return idcdMusica;
    }

    public void setIdcdMusica(Integer idcdMusica) {
        this.idcdMusica = idcdMusica;
    }

    public int getArticuloidArticulo() {
        return articuloidArticulo;
    }

    public void setArticuloidArticulo(int articuloidArticulo) {
        this.articuloidArticulo = articuloidArticulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getNoPistas() {
        return noPistas;
    }

    public void setNoPistas(Integer noPistas) {
        this.noPistas = noPistas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcdMusica != null ? idcdMusica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CdMusica)) {
            return false;
        }
        CdMusica other = (CdMusica) object;
        if ((this.idcdMusica == null && other.idcdMusica != null) || (this.idcdMusica != null && !this.idcdMusica.equals(other.idcdMusica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.CdMusica[ idcdMusica=" + idcdMusica + " ]";
    }
    
}
