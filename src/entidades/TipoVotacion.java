package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1



/**
 * TipoVotacion generated by hbm2java
 */
public class TipoVotacion  implements java.io.Serializable {


     private Integer idTipoVotacion;
     private String tipoVotacion;

    public TipoVotacion() {
    }

    public TipoVotacion(String tipoVotacion) {
       this.tipoVotacion = tipoVotacion;
    }
   
    public Integer getIdTipoVotacion() {
        return this.idTipoVotacion;
    }
    
    public void setIdTipoVotacion(Integer idTipoVotacion) {
        this.idTipoVotacion = idTipoVotacion;
    }
    public String getTipoVotacion() {
        return this.tipoVotacion;
    }
    
    public void setTipoVotacion(String tipoVotacion) {
        this.tipoVotacion = tipoVotacion;
    }




}

