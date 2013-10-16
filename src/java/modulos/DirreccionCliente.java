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
@Table(name = "DirreccionCliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DirreccionCliente.findAll", query = "SELECT d FROM DirreccionCliente d"),
    @NamedQuery(name = "DirreccionCliente.findByIdDirreccionCliente", query = "SELECT d FROM DirreccionCliente d WHERE d.idDirreccionCliente = :idDirreccionCliente"),
    @NamedQuery(name = "DirreccionCliente.findByClienteNickName", query = "SELECT d FROM DirreccionCliente d WHERE d.clienteNickName = :clienteNickName"),
    @NamedQuery(name = "DirreccionCliente.findByDireccion", query = "SELECT d FROM DirreccionCliente d WHERE d.direccion = :direccion")})
public class DirreccionCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDirreccionCliente")
    private Integer idDirreccionCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Cliente_NickName")
    private String clienteNickName;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;

    public DirreccionCliente() {
    }

    public DirreccionCliente(Integer idDirreccionCliente) {
        this.idDirreccionCliente = idDirreccionCliente;
    }

    public DirreccionCliente(Integer idDirreccionCliente, String clienteNickName) {
        this.idDirreccionCliente = idDirreccionCliente;
        this.clienteNickName = clienteNickName;
    }

    public Integer getIdDirreccionCliente() {
        return idDirreccionCliente;
    }

    public void setIdDirreccionCliente(Integer idDirreccionCliente) {
        this.idDirreccionCliente = idDirreccionCliente;
    }

    public String getClienteNickName() {
        return clienteNickName;
    }

    public void setClienteNickName(String clienteNickName) {
        this.clienteNickName = clienteNickName;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDirreccionCliente != null ? idDirreccionCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DirreccionCliente)) {
            return false;
        }
        DirreccionCliente other = (DirreccionCliente) object;
        if ((this.idDirreccionCliente == null && other.idDirreccionCliente != null) || (this.idDirreccionCliente != null && !this.idDirreccionCliente.equals(other.idDirreccionCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.DirreccionCliente[ idDirreccionCliente=" + idDirreccionCliente + " ]";
    }
    
}
