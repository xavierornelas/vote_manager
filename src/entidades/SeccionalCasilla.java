package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * SeccionalCasilla generated by hbm2java
 */
public class SeccionalCasilla  implements java.io.Serializable {


     private Integer idSeccionalCasilla;
     private int idSeccional;
     private int idCasilla;
     private int idUsuario;

    public SeccionalCasilla() {
    }

    public SeccionalCasilla(int idSeccional, int idCasilla, int idUsuario) {
       this.idSeccional = idSeccional;
       this.idCasilla = idCasilla;
       this.idUsuario = idUsuario;
    }
   
    public Integer getIdSeccionalCasilla() {
        return this.idSeccionalCasilla;
    }
    
    public void setIdSeccionalCasilla(Integer idSeccionalCasilla) {
        this.idSeccionalCasilla = idSeccionalCasilla;
    }
    public int getIdSeccional() {
        return this.idSeccional;
    }
    
    public void setIdSeccional(int idSeccional) {
        this.idSeccional = idSeccional;
    }
    public int getIdCasilla() {
        return this.idCasilla;
    }
    
    public void setIdCasilla(int idCasilla) {
        this.idCasilla = idCasilla;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}


