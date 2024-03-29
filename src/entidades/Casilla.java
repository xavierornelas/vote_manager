package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * Casilla generated by hbm2java
 */
public class Casilla  implements java.io.Serializable {


     private Integer idCasilla;
     private int idSeccional;
     private int idTipoCasilla;
     private String descripcion;
     private int idUsuario;
     private String nombreCasilla;

    public Casilla() {
    }

	
    public Casilla(int idSeccional, int idTipoCasilla, int idUsuario, String nombreCasilla) {
        this.idSeccional = idSeccional;
        this.idTipoCasilla = idTipoCasilla;
        this.idUsuario = idUsuario;
        this.nombreCasilla = nombreCasilla;
    }
    public Casilla(int idSeccional, int idTipoCasilla, String descripcion, int idUsuario, String nombreCasilla) {
       this.idSeccional = idSeccional;
       this.idTipoCasilla = idTipoCasilla;
       this.descripcion = descripcion;
       this.idUsuario = idUsuario;
       this.nombreCasilla = nombreCasilla;
    }
   
    public Integer getIdCasilla() {
        return this.idCasilla;
    }
    
    public void setIdCasilla(Integer idCasilla) {
        this.idCasilla = idCasilla;
    }
    public int getIdSeccional() {
        return this.idSeccional;
    }
    
    public void setIdSeccional(int idSeccional) {
        this.idSeccional = idSeccional;
    }
    public int getIdTipoCasilla() {
        return this.idTipoCasilla;
    }
    
    public void setIdTipoCasilla(int idTipoCasilla) {
        this.idTipoCasilla = idTipoCasilla;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreCasilla() {
        return this.nombreCasilla;
    }
    
    public void setNombreCasilla(String nombreCasilla) {
        this.nombreCasilla = nombreCasilla;
    }




}


