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
@Table(name = "pelicula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p"),
    @NamedQuery(name = "Pelicula.findByIdpelicula", query = "SELECT p FROM Pelicula p WHERE p.idpelicula = :idpelicula"),
    @NamedQuery(name = "Pelicula.findByArticuloidArticulo", query = "SELECT p FROM Pelicula p WHERE p.articuloidArticulo = :articuloidArticulo"),
    @NamedQuery(name = "Pelicula.findByDuracion", query = "SELECT p FROM Pelicula p WHERE p.duracion = :duracion"),
    @NamedQuery(name = "Pelicula.findByA\u00f1o", query = "SELECT p FROM Pelicula p WHERE p.a\u00f1o = :a\u00f1o"),
    @NamedQuery(name = "Pelicula.findByPais", query = "SELECT p FROM Pelicula p WHERE p.pais = :pais"),
    @NamedQuery(name = "Pelicula.findByProductora", query = "SELECT p FROM Pelicula p WHERE p.productora = :productora")})
public class Pelicula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpelicula")
    private Integer idpelicula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Articulo_idArticulo")
    private int articuloidArticulo;
    @Size(max = 30)
    @Column(name = "Duracion")
    private String duracion;
    @Column(name = "a\u00f1o")
    private Integer año;
    @Size(max = 30)
    @Column(name = "pais")
    private String pais;
    @Size(max = 30)
    @Column(name = "productora")
    private String productora;

    public Pelicula() {
    }

    public Pelicula(Integer idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Pelicula(Integer idpelicula, int articuloidArticulo) {
        this.idpelicula = idpelicula;
        this.articuloidArticulo = articuloidArticulo;
    }

    public Integer getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Integer idpelicula) {
        this.idpelicula = idpelicula;
    }

    public int getArticuloidArticulo() {
        return articuloidArticulo;
    }

    public void setArticuloidArticulo(int articuloidArticulo) {
        this.articuloidArticulo = articuloidArticulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpelicula != null ? idpelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idpelicula == null && other.idpelicula != null) || (this.idpelicula != null && !this.idpelicula.equals(other.idpelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Pelicula[ idpelicula=" + idpelicula + " ]";
    }
    
}
