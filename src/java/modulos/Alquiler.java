/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaqui
 */
@Entity
@Table(name = "Alquiler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alquiler.findAll", query = "SELECT a FROM Alquiler a"),
    @NamedQuery(name = "Alquiler.findByIdAlquiler", query = "SELECT a FROM Alquiler a WHERE a.idAlquiler = :idAlquiler"),
    @NamedQuery(name = "Alquiler.findByClienteNickName", query = "SELECT a FROM Alquiler a WHERE a.clienteNickName = :clienteNickName"),
    @NamedQuery(name = "Alquiler.findByArticuloidArticulo", query = "SELECT a FROM Alquiler a WHERE a.articuloidArticulo = :articuloidArticulo"),
    @NamedQuery(name = "Alquiler.findByFechaAlquiler", query = "SELECT a FROM Alquiler a WHERE a.fechaAlquiler = :fechaAlquiler"),
    @NamedQuery(name = "Alquiler.findByFechadeEntrega", query = "SELECT a FROM Alquiler a WHERE a.fechadeEntrega = :fechadeEntrega"),
    @NamedQuery(name = "Alquiler.findByFechadeDevolucion", query = "SELECT a FROM Alquiler a WHERE a.fechadeDevolucion = :fechadeDevolucion")})
public class Alquiler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlquiler")
    private Integer idAlquiler;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Cliente_NickName")
    private String clienteNickName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Articulo_idArticulo")
    private int articuloidArticulo;
    @Column(name = "FechaAlquiler")
    @Temporal(TemporalType.DATE)
    private Date fechaAlquiler;
    @Column(name = "fechadeEntrega")
    @Temporal(TemporalType.DATE)
    private Date fechadeEntrega;
    @Column(name = "FechadeDevolucion")
    @Temporal(TemporalType.DATE)
    private Date fechadeDevolucion;

    public Alquiler() {
    }

    public Alquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Alquiler(Integer idAlquiler, String clienteNickName, int articuloidArticulo) {
        this.idAlquiler = idAlquiler;
        this.clienteNickName = clienteNickName;
        this.articuloidArticulo = articuloidArticulo;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getClienteNickName() {
        return clienteNickName;
    }

    public void setClienteNickName(String clienteNickName) {
        this.clienteNickName = clienteNickName;
    }

    public int getArticuloidArticulo() {
        return articuloidArticulo;
    }

    public void setArticuloidArticulo(int articuloidArticulo) {
        this.articuloidArticulo = articuloidArticulo;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechadeEntrega() {
        return fechadeEntrega;
    }

    public void setFechadeEntrega(Date fechadeEntrega) {
        this.fechadeEntrega = fechadeEntrega;
    }

    public Date getFechadeDevolucion() {
        return fechadeDevolucion;
    }

    public void setFechadeDevolucion(Date fechadeDevolucion) {
        this.fechadeDevolucion = fechadeDevolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlquiler != null ? idAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquiler)) {
            return false;
        }
        Alquiler other = (Alquiler) object;
        if ((this.idAlquiler == null && other.idAlquiler != null) || (this.idAlquiler != null && !this.idAlquiler.equals(other.idAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Alquiler[ idAlquiler=" + idAlquiler + " ]";
    }
    
}
