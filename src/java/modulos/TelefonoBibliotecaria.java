/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "TelefonoBibliotecaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoBibliotecaria.findAll", query = "SELECT t FROM TelefonoBibliotecaria t"),
    @NamedQuery(name = "TelefonoBibliotecaria.findByIdTelefonoBibliotecaria", query = "SELECT t FROM TelefonoBibliotecaria t WHERE t.idTelefonoBibliotecaria = :idTelefonoBibliotecaria"),
    @NamedQuery(name = "TelefonoBibliotecaria.findByBibliotecarianickname", query = "SELECT t FROM TelefonoBibliotecaria t WHERE t.bibliotecarianickname = :bibliotecarianickname"),
    @NamedQuery(name = "TelefonoBibliotecaria.findByTelefono", query = "SELECT t FROM TelefonoBibliotecaria t WHERE t.telefono = :telefono")})
public class TelefonoBibliotecaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTelefonoBibliotecaria")
    private Integer idTelefonoBibliotecaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Bibliotecaria_nickname")
    private String bibliotecarianickname;
    @Column(name = "telefono")
    private BigInteger telefono;

    public TelefonoBibliotecaria() {
    }

    public TelefonoBibliotecaria(Integer idTelefonoBibliotecaria) {
        this.idTelefonoBibliotecaria = idTelefonoBibliotecaria;
    }

    public TelefonoBibliotecaria(Integer idTelefonoBibliotecaria, String bibliotecarianickname) {
        this.idTelefonoBibliotecaria = idTelefonoBibliotecaria;
        this.bibliotecarianickname = bibliotecarianickname;
    }

    public Integer getIdTelefonoBibliotecaria() {
        return idTelefonoBibliotecaria;
    }

    public void setIdTelefonoBibliotecaria(Integer idTelefonoBibliotecaria) {
        this.idTelefonoBibliotecaria = idTelefonoBibliotecaria;
    }

    public String getBibliotecarianickname() {
        return bibliotecarianickname;
    }

    public void setBibliotecarianickname(String bibliotecarianickname) {
        this.bibliotecarianickname = bibliotecarianickname;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelefonoBibliotecaria != null ? idTelefonoBibliotecaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoBibliotecaria)) {
            return false;
        }
        TelefonoBibliotecaria other = (TelefonoBibliotecaria) object;
        if ((this.idTelefonoBibliotecaria == null && other.idTelefonoBibliotecaria != null) || (this.idTelefonoBibliotecaria != null && !this.idTelefonoBibliotecaria.equals(other.idTelefonoBibliotecaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.TelefonoBibliotecaria[ idTelefonoBibliotecaria=" + idTelefonoBibliotecaria + " ]";
    }
    
}
