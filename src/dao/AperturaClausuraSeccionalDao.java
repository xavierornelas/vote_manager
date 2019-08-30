/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.AperturaClausuraSeccional;
import java.util.List;

/**
 *
 * @author franciscoornelas
 */
public interface AperturaClausuraSeccionalDao {
    public Boolean agregarAperturaClausura(AperturaClausuraSeccional aper);
    public List<AperturaClausuraSeccional>obtenerRegistrosPorCasilla(Integer idCasilla);
}
