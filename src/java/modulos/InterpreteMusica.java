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
@Table(name = "interpreteMusica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InterpreteMusica.findAll", query = "SELECT i FROM InterpreteMusica i"),
    @NamedQuery(name = "InterpreteMusica.findByIdinterpreteMusica", query = "SELECT i FROM InterpreteMusica i WHERE i.idinterpreteMusica = :idinterpreteMusica"),
    @NamedQuery(name = "InterpreteMusica.findByCdMusicaidcdMusica", query = "SELECT i FROM InterpreteMusica i WHERE i.cdMusicaidcdMusica = :cdMusicaidcdMusica"),
    @NamedQuery(name = "InterpreteMusica.findByInformacion", query = "SELECT i FROM InterpreteMusica i WHERE i.informacion = :informacion")})
public class InterpreteMusica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinterpreteMusica")
    private Integer idinterpreteMusica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cdMusica_idcdMusica")
    private int cdMusicaidcdMusica;
    @Size(max = 30)
    @Column(name = "informacion")
    private String informacion;

    public InterpreteMusica() {
    }

    public InterpreteMusica(Integer idinterpreteMusica) {
        this.idinterpreteMusica = idinterpreteMusica;
    }

    public InterpreteMusica(Integer idinterpreteMusica, int cdMusicaidcdMusica) {
        this.idinterpreteMusica = idinterpreteMusica;
        this.cdMusicaidcdMusica = cdMusicaidcdMusica;
    }

    public Integer getIdinterpreteMusica() {
        return idinterpreteMusica;
    }

    public void setIdinterpreteMusica(Integer idinterpreteMusica) {
        this.idinterpreteMusica = idinterpreteMusica;
    }

    public int getCdMusicaidcdMusica() {
        return cdMusicaidcdMusica;
    }

    public void setCdMusicaidcdMusica(int cdMusicaidcdMusica) {
        this.cdMusicaidcdMusica = cdMusicaidcdMusica;
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
        hash += (idinterpreteMusica != null ? idinterpreteMusica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InterpreteMusica)) {
            return false;
        }
        InterpreteMusica other = (InterpreteMusica) object;
        if ((this.idinterpreteMusica == null && other.idinterpreteMusica != null) || (this.idinterpreteMusica != null && !this.idinterpreteMusica.equals(other.idinterpreteMusica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.InterpreteMusica[ idinterpreteMusica=" + idinterpreteMusica + " ]";
    }
    
}
