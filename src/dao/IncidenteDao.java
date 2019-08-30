/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Incidente;
import java.util.List;

/**
 *
 * @author franciscoornelasmartinez
 */
public interface IncidenteDao {
    public Boolean crearIncidente(Incidente inc);
    public List<Incidente>obtenerIncidentes();
    public List<Incidente>obtenerIncidentesPorUsuario(Integer idUsuario);
    public Boolean modificarIncidente(Incidente inc);
}
