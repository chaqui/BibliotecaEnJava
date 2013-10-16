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
@Table(name = "DirreccionBibliotecaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DirreccionBibliotecaria.findAll", query = "SELECT d FROM DirreccionBibliotecaria d"),
    @NamedQuery(name = "DirreccionBibliotecaria.findByIdDirreccionBibliotecaria", query = "SELECT d FROM DirreccionBibliotecaria d WHERE d.idDirreccionBibliotecaria = :idDirreccionBibliotecaria"),
    @NamedQuery(name = "DirreccionBibliotecaria.findByBibliotecarianickname", query = "SELECT d FROM DirreccionBibliotecaria d WHERE d.bibliotecarianickname = :bibliotecarianickname"),
    @NamedQuery(name = "DirreccionBibliotecaria.findByDireccion", query = "SELECT d FROM DirreccionBibliotecaria d WHERE d.direccion = :direccion")})
public class DirreccionBibliotecaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDirreccionBibliotecaria")
    private Integer idDirreccionBibliotecaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Bibliotecaria_nickname")
    private String bibliotecarianickname;
    @Size(max = 40)
    @Column(name = "Direccion")
    private String direccion;

    public DirreccionBibliotecaria() {
    }

    public DirreccionBibliotecaria(Integer idDirreccionBibliotecaria) {
        this.idDirreccionBibliotecaria = idDirreccionBibliotecaria;
    }

    public DirreccionBibliotecaria(Integer idDirreccionBibliotecaria, String bibliotecarianickname) {
        this.idDirreccionBibliotecaria = idDirreccionBibliotecaria;
        this.bibliotecarianickname = bibliotecarianickname;
    }

    public Integer getIdDirreccionBibliotecaria() {
        return idDirreccionBibliotecaria;
    }

    public void setIdDirreccionBibliotecaria(Integer idDirreccionBibliotecaria) {
        this.idDirreccionBibliotecaria = idDirreccionBibliotecaria;
    }

    public String getBibliotecarianickname() {
        return bibliotecarianickname;
    }

    public void setBibliotecarianickname(String bibliotecarianickname) {
        this.bibliotecarianickname = bibliotecarianickname;
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
        hash += (idDirreccionBibliotecaria != null ? idDirreccionBibliotecaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DirreccionBibliotecaria)) {
            return false;
        }
        DirreccionBibliotecaria other = (DirreccionBibliotecaria) object;
        if ((this.idDirreccionBibliotecaria == null && other.idDirreccionBibliotecaria != null) || (this.idDirreccionBibliotecaria != null && !this.idDirreccionBibliotecaria.equals(other.idDirreccionBibliotecaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.DirreccionBibliotecaria[ idDirreccionBibliotecaria=" + idDirreccionBibliotecaria + " ]";
    }
    
}
