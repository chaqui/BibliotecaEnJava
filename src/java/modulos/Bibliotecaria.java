/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Bibliotecaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bibliotecaria.findAll", query = "SELECT b FROM Bibliotecaria b"),
    @NamedQuery(name = "Bibliotecaria.findByNickname", query = "SELECT b FROM Bibliotecaria b WHERE b.nickname = :nickname"),
    @NamedQuery(name = "Bibliotecaria.findByContrase\u00f1a", query = "SELECT b FROM Bibliotecaria b WHERE b.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Bibliotecaria.findByNombre", query = "SELECT b FROM Bibliotecaria b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "Bibliotecaria.findByApellido", query = "SELECT b FROM Bibliotecaria b WHERE b.apellido = :apellido"),
    @NamedQuery(name = "Bibliotecaria.findByDni", query = "SELECT b FROM Bibliotecaria b WHERE b.dni = :dni")})
public class Bibliotecaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nickname")
    private String nickname;
    @Size(max = 20)
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "DNI")
    private String dni;

    public Bibliotecaria() {
    }

    public Bibliotecaria(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nickname != null ? nickname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bibliotecaria)) {
            return false;
        }
        Bibliotecaria other = (Bibliotecaria) object;
        if ((this.nickname == null && other.nickname != null) || (this.nickname != null && !this.nickname.equals(other.nickname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Bibliotecaria[ nickname=" + nickname + " ]";
    }
    
}
