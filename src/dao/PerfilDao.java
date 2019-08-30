/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Perfil;
import entidades.SeccionalPerfil;
import java.util.List;

/**
 *
 * @author franciscoornelas
 */
public interface PerfilDao {
    public List<Perfil> obtenerPersonalidades();
    public List<Perfil> obtenerPersonalidadesConDetalle(List<SeccionalPerfil> lista);
    public List<SeccionalPerfil> obtenerPersonalidades(Integer idSeccional);
    public Boolean agregarPersonalidad(Perfil perfil,Integer idSeccional,Integer idUsuario);
    
}
