package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * UsuarioContrasenia generated by hbm2java
 */
public class UsuarioContrasenia  implements java.io.Serializable {


     private int idUsuarioContrasenia;
     private int idUsuario;
     private String contrasenia;

    public UsuarioContrasenia() {
    }

    public UsuarioContrasenia(int idUsuarioContrasenia, int idUsuario, String contrasenia) {
       this.idUsuarioContrasenia = idUsuarioContrasenia;
       this.idUsuario = idUsuario;
       this.contrasenia = contrasenia;
    }
   
    public int getIdUsuarioContrasenia() {
        return this.idUsuarioContrasenia;
    }
    
    public void setIdUsuarioContrasenia(int idUsuarioContrasenia) {
        this.idUsuarioContrasenia = idUsuarioContrasenia;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }




}


