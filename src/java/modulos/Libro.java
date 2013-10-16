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
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "Libro.findByIdlibro", query = "SELECT l FROM Libro l WHERE l.idlibro = :idlibro"),
    @NamedQuery(name = "Libro.findByArticuloidArticulo", query = "SELECT l FROM Libro l WHERE l.articuloidArticulo = :articuloidArticulo"),
    @NamedQuery(name = "Libro.findByNoPaginas", query = "SELECT l FROM Libro l WHERE l.noPaginas = :noPaginas"),
    @NamedQuery(name = "Libro.findByA\u00f1o", query = "SELECT l FROM Libro l WHERE l.a\u00f1o = :a\u00f1o"),
    @NamedQuery(name = "Libro.findByEditorial", query = "SELECT l FROM Libro l WHERE l.editorial = :editorial"),
    @NamedQuery(name = "Libro.findByPais", query = "SELECT l FROM Libro l WHERE l.pais = :pais")})
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlibro")
    private Integer idlibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Articulo_idArticulo")
    private int articuloidArticulo;
    @Column(name = "NoPaginas")
    private Integer noPaginas;
    @Column(name = "a\u00f1o")
    private Integer año;
    @Size(max = 30)
    @Column(name = "Editorial")
    private String editorial;
    @Size(max = 30)
    @Column(name = "Pais")
    private String pais;

    public Libro() {
    }

    public Libro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public Libro(Integer idlibro, int articuloidArticulo) {
        this.idlibro = idlibro;
        this.articuloidArticulo = articuloidArticulo;
    }

    public Integer getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public int getArticuloidArticulo() {
        return articuloidArticulo;
    }

    public void setArticuloidArticulo(int articuloidArticulo) {
        this.articuloidArticulo = articuloidArticulo;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlibro != null ? idlibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.idlibro == null && other.idlibro != null) || (this.idlibro != null && !this.idlibro.equals(other.idlibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Libro[ idlibro=" + idlibro + " ]";
    }
    
}
