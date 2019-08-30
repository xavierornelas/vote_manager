/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queries;

/**
 *
 * @author franciscoornelas
 */
public class UsuarioQuery {
    private static String OBTENER_USUARIOS_QUERY="SELECT * FROM USUARIO";
    private static String OBTENER_USUARIO_QUERY="SELECT * FROM votalandia.USUARIO where usuario='";
    private static String VERIFICAR_CONTRASENIA_QUERY="SELECT u.usuario, c.contrasenia FROM USUARIO u inner join usuario_contrasenia c on u.ID_USUARIO=c.ID_USUARIO where usuario='";
}
