/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Seccional;
import java.util.List;

/**
 *
 * @author franciscoornelas
 */
public interface SeccionalDao {
    
    public List<Seccional> obtenerSeccionales();
    public Boolean agregarSeccional(Seccional seccional);
    public Seccional obtenerSeccionalPorNombre(String seccional);
    public List<Seccional>obtenerSeccionalesNoRegistrados();
    
}
