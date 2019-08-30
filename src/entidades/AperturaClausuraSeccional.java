package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AperturaClausuraSeccional generated by hbm2java
 */
public class AperturaClausuraSeccional  implements java.io.Serializable {


     private Integer idAperturaSeccional;
     private int idSeccional;
     private int idTipoHorarioSeccional;
     private Date horaRegistro;
     private int idUsuario;
     private int idCasilla;

    public AperturaClausuraSeccional() {
    }

    public AperturaClausuraSeccional(int idSeccional, int idTipoHorarioSeccional, Date horaRegistro, int idUsuario, int idCasilla) {
       this.idSeccional = idSeccional;
       this.idTipoHorarioSeccional = idTipoHorarioSeccional;
       this.horaRegistro = horaRegistro;
       this.idUsuario = idUsuario;
       this.idCasilla = idCasilla;
    }
   
    public Integer getIdAperturaSeccional() {
        return this.idAperturaSeccional;
    }
    
    public void setIdAperturaSeccional(Integer idAperturaSeccional) {
        this.idAperturaSeccional = idAperturaSeccional;
    }
    public int getIdSeccional() {
        return this.idSeccional;
    }
    
    public void setIdSeccional(int idSeccional) {
        this.idSeccional = idSeccional;
    }
    public int getIdTipoHorarioSeccional() {
        return this.idTipoHorarioSeccional;
    }
    
    public void setIdTipoHorarioSeccional(int idTipoHorarioSeccional) {
        this.idTipoHorarioSeccional = idTipoHorarioSeccional;
    }
    public Date getHoraRegistro() {
        return this.horaRegistro;
    }
    
    public void setHoraRegistro(Date horaRegistro) {
        this.horaRegistro = horaRegistro;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getIdCasilla() {
        return this.idCasilla;
    }
    
    public void setIdCasilla(int idCasilla) {
        this.idCasilla = idCasilla;
    }




}


