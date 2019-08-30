/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Usuario;
import entidades.UsuarioContrasenia;
import java.util.List;

/**
 *
 * @author franciscoornelas
 */
public interface UsuarioDao {
    public List<Usuario>obtenerUsuarios();
    public Usuario obtenerUsuario(String usuario);
    public Boolean verificarContraseña(Usuario usuario, String contrasena);
    public Boolean agregarUsuario(Usuario usuario,UsuarioContrasenia contrasena);
    public Boolean modificarUsuario(Usuario usuario);
    public Boolean eliminarUsuario(int id);
}
