package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * TipoUsuario generated by hbm2java
 */
public class TipoUsuario  implements java.io.Serializable {


     private int idTipoUsuario;
     private String tipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String tipoUsuario) {
       this.idTipoUsuario = idTipoUsuario;
       this.tipoUsuario = tipoUsuario;
    }
   
    public int getIdTipoUsuario() {
        return this.idTipoUsuario;
    }
    
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }




}

