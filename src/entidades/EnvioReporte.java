package entidades;
// Generated 5/06/2018 12:02:43 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * EnvioReporte generated by hbm2java
 */
public class EnvioReporte  implements java.io.Serializable {


     private Integer idEnvioReporte;
     private int idReporte;
     private Date horaEjecucion;
     private int idUsuario;
     private String correosEnviados;

    public EnvioReporte() {
    }

    public EnvioReporte(int idReporte, Date horaEjecucion, int idUsuario, String correosEnviados) {
       this.idReporte = idReporte;
       this.horaEjecucion = horaEjecucion;
       this.idUsuario = idUsuario;
       this.correosEnviados = correosEnviados;
    }
   
    public Integer getIdEnvioReporte() {
        return this.idEnvioReporte;
    }
    
    public void setIdEnvioReporte(Integer idEnvioReporte) {
        this.idEnvioReporte = idEnvioReporte;
    }
    public int getIdReporte() {
        return this.idReporte;
    }
    
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
    public Date getHoraEjecucion() {
        return this.horaEjecucion;
    }
    
    public void setHoraEjecucion(Date horaEjecucion) {
        this.horaEjecucion = horaEjecucion;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getCorreosEnviados() {
        return this.correosEnviados;
    }
    
    public void setCorreosEnviados(String correosEnviados) {
        this.correosEnviados = correosEnviados;
    }




}


