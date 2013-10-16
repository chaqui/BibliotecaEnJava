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
@Table(name = "TelefonoCliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoCliente.findAll", query = "SELECT t FROM TelefonoCliente t"),
    @NamedQuery(name = "TelefonoCliente.findByIdTelefonoCliente", query = "SELECT t FROM TelefonoCliente t WHERE t.idTelefonoCliente = :idTelefonoCliente"),
    @NamedQuery(name = "TelefonoCliente.findByClienteNickName", query = "SELECT t FROM TelefonoCliente t WHERE t.clienteNickName = :clienteNickName"),
    @NamedQuery(name = "TelefonoCliente.findByTelefono", query = "SELECT t FROM TelefonoCliente t WHERE t.telefono = :telefono")})
public class TelefonoCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTelefonoCliente")
    private Integer idTelefonoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Cliente_NickName")
    private String clienteNickName;
    @Column(name = "Telefono")
    private BigInteger telefono;

    public TelefonoCliente() {
    }

    public TelefonoCliente(Integer idTelefonoCliente) {
        this.idTelefonoCliente = idTelefonoCliente;
    }

    public TelefonoCliente(Integer idTelefonoCliente, String clienteNickName) {
        this.idTelefonoCliente = idTelefonoCliente;
        this.clienteNickName = clienteNickName;
    }

    public Integer getIdTelefonoCliente() {
        return idTelefonoCliente;
    }

    public void setIdTelefonoCliente(Integer idTelefonoCliente) {
        this.idTelefonoCliente = idTelefonoCliente;
    }

    public String getClienteNickName() {
        return clienteNickName;
    }

    public void setClienteNickName(String clienteNickName) {
        this.clienteNickName = clienteNickName;
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
        hash += (idTelefonoCliente != null ? idTelefonoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoCliente)) {
            return false;
        }
        TelefonoCliente other = (TelefonoCliente) object;
        if ((this.idTelefonoCliente == null && other.idTelefonoCliente != null) || (this.idTelefonoCliente != null && !this.idTelefonoCliente.equals(other.idTelefonoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.TelefonoCliente[ idTelefonoCliente=" + idTelefonoCliente + " ]";
    }
    
}
