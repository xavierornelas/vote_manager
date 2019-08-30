/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import configuracion.HibernateUtil;
import entidades.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.hibernate.SessionFactory;

/**
 *
 * @author franciscoornelas
 */
public class ContenedorPrincipal extends javax.swing.JFrame {
    Usuario usuario;
    /**
     * Creates new form ContenedorPrincipal
     */
    public ContenedorPrincipal(Usuario usuario) {
        initComponents();
        this.usuario=usuario;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMIPerfil = new javax.swing.JMenuItem();
        jMICambiarUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMEditar = new javax.swing.JMenu();
        jMIAltaSeccional = new javax.swing.JMenuItem();
        jMIAltaUsuario = new javax.swing.JMenuItem();
        jMHerramientas = new javax.swing.JMenu();
        jMIVotosEsperados = new javax.swing.JMenuItem();
        jMIVotosAproximados = new javax.swing.JMenuItem();
        jMIRegistroHorarioCasilla = new javax.swing.JMenuItem();
        jMIArmarSeccional = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICrearIncidente = new javax.swing.JMenuItem();
        jMIBuscarIncidente = new javax.swing.JMenuItem();
        jMIVerIncidentes = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1028, 1028));

        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1);

        jMArchivo.setText("Archivo");

        jMIPerfil.setText("Perfil");
        jMIPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPerfilActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIPerfil);

        jMICambiarUsuario.setText("Cambiar usuario");
        jMArchivo.add(jMICambiarUsuario);

        jMenuItem2.setText("Cerrar programa");
        jMArchivo.add(jMenuItem2);

        jMenuBar1.add(jMArchivo);

        jMEditar.setText("Editar");

        jMIAltaSeccional.setText("Alta seccional");
        jMIAltaSeccional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltaSeccionalActionPerformed(evt);
            }
        });
        jMEditar.add(jMIAltaSeccional);

        jMIAltaUsuario.setText("Alta usuario");
        jMIAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltaUsuarioActionPerformed(evt);
            }
        });
        jMEditar.add(jMIAltaUsuario);

        jMenuBar1.add(jMEditar);

        jMHerramientas.setText("Herramientas");

        jMIVotosEsperados.setText("Votos esperados");
        jMIVotosEsperados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVotosEsperadosActionPerformed(evt);
            }
        });
        jMHerramientas.add(jMIVotosEsperados);

        jMIVotosAproximados.setText("Votos aproximados");
        jMIVotosAproximados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVotosAproximadosActionPerformed(evt);
            }
        });
        jMHerramientas.add(jMIVotosAproximados);

        jMIRegistroHorarioCasilla.setText("Registro de horario casilla");
        jMIRegistroHorarioCasilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegistroHorarioCasillaActionPerformed(evt);
            }
        });
        jMHerramientas.add(jMIRegistroHorarioCasilla);

        jMIArmarSeccional.setText("Armar seccional");
        jMIArmarSeccional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIArmarSeccionalActionPerformed(evt);
            }
        });
        jMHerramientas.add(jMIArmarSeccional);

        jMenu2.setText("Incidentes");

        jMICrearIncidente.setText("Crear incidente");
        jMICrearIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICrearIncidenteActionPerformed(evt);
            }
        });
        jMenu2.add(jMICrearIncidente);

        jMIBuscarIncidente.setText("Buscar incidente");
        jMenu2.add(jMIBuscarIncidente);

        jMIVerIncidentes.setText("Ver todos los incidentes");
        jMenu2.add(jMIVerIncidentes);

        jMHerramientas.add(jMenu2);

        jMenuBar1.add(jMHerramientas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAltaSeccionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltaSeccionalActionPerformed
        // TODO add your handling code here:
        AltaSeccionalesForm altaSeccional = new AltaSeccionalesForm(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        altaSeccional.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaSeccional.setLocation(dim.width/2-altaSeccional.getSize().width/2, dim.height/2-altaSeccional.getSize().height/2);
        altaSeccional.setVisible(true);
    }//GEN-LAST:event_jMIAltaSeccionalActionPerformed

    private void jMIAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltaUsuarioActionPerformed
        AltaUsuario user = new AltaUsuario(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        user.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        user.setLocation(dim.width/2-user.getSize().width/2, dim.height/2-user.getSize().height/2);
        user.setVisible(true);
    }//GEN-LAST:event_jMIAltaUsuarioActionPerformed

    private void jMIVotosEsperadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVotosEsperadosActionPerformed
        // TODO add your handling code here:
        VotosEsperadosForm esperados = new VotosEsperadosForm(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        esperados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        esperados.setLocation(dim.width/2-esperados.getSize().width/2, dim.height/2-esperados.getSize().height/2);
        esperados.setVisible(true);
    }//GEN-LAST:event_jMIVotosEsperadosActionPerformed

    private void jMIRegistroHorarioCasillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegistroHorarioCasillaActionPerformed
        // TODO add your handling code here:
        AperturaClausuraSeccionalForm apertura = new AperturaClausuraSeccionalForm(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        apertura.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        apertura.setLocation(dim.width/2-apertura.getSize().width/2, dim.height/2-apertura.getSize().height/2);
        apertura.setVisible(true);
    }//GEN-LAST:event_jMIRegistroHorarioCasillaActionPerformed

    private void jMIArmarSeccionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIArmarSeccionalActionPerformed
        // TODO add your handling code here:
        AltaSeccionalForm altaSeccional = new AltaSeccionalForm(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        altaSeccional.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaSeccional.setLocation(dim.width/2-altaSeccional.getSize().width/2, dim.height/2-altaSeccional.getSize().height/2);
        altaSeccional.setVisible(true);
    }//GEN-LAST:event_jMIArmarSeccionalActionPerformed

    private void jMIVotosAproximadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVotosAproximadosActionPerformed
        // TODO add your handling code here:
        AproximadoVotosForm esperados = new AproximadoVotosForm(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        esperados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        esperados.setLocation(dim.width/2-esperados.getSize().width/2, dim.height/2-esperados.getSize().height/2);
        esperados.setVisible(true);
    }//GEN-LAST:event_jMIVotosAproximadosActionPerformed

    private void jMICrearIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICrearIncidenteActionPerformed
        // TODO add your handling code here:
        AltaIncidente esperados = new AltaIncidente(usuario);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        esperados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        esperados.setLocation(dim.width/2-esperados.getSize().width/2, dim.height/2-esperados.getSize().height/2);
        esperados.setVisible(true);
    }//GEN-LAST:event_jMICrearIncidenteActionPerformed

    private void jMIPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIPerfilActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenu jMEditar;
    private javax.swing.JMenu jMHerramientas;
    private javax.swing.JMenuItem jMIAltaSeccional;
    private javax.swing.JMenuItem jMIAltaUsuario;
    private javax.swing.JMenuItem jMIArmarSeccional;
    private javax.swing.JMenuItem jMIBuscarIncidente;
    private javax.swing.JMenuItem jMICambiarUsuario;
    private javax.swing.JMenuItem jMICrearIncidente;
    private javax.swing.JMenuItem jMIPerfil;
    private javax.swing.JMenuItem jMIRegistroHorarioCasilla;
    private javax.swing.JMenuItem jMIVerIncidentes;
    private javax.swing.JMenuItem jMIVotosAproximados;
    private javax.swing.JMenuItem jMIVotosEsperados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
