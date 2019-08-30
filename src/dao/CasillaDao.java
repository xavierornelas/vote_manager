/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Casilla;
import java.util.List;

/**
 *
 * @author franciscoornelas
 */
public interface CasillaDao {
    public List<Casilla> obtenerCasillas();
    public List<Casilla> obtenerCasillasPorSeccional(Integer idSeccional);
    public Boolean agregarCasilla(Casilla casilla);
}
