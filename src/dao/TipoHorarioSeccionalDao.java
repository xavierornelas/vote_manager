/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.TipoHorarioSeccional;
import java.util.List;

/**
 *
 * @author franciscoornelasmartinez
 */
public interface TipoHorarioSeccionalDao {
    public List<TipoHorarioSeccional> obtenerTipoHorario();
    public TipoHorarioSeccional obtenerTipoHorario(Integer idTipoHorario);
}
