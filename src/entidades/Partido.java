package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * Partido generated by hbm2java
 */
public class Partido  implements java.io.Serializable {


     private Integer idPartido;
     private String partido;

    public Partido() {
    }

    public Partido(String partido) {
       this.partido = partido;
    }
   
    public Integer getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }
    public String getPartido() {
        return this.partido;
    }
    
    public void setPartido(String partido) {
        this.partido = partido;
    }




}


