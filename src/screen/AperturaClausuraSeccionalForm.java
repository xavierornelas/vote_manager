/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import dao.AperturaClausuraSeccionalDaoImp;
import dao.CasillaDaoImp;
import dao.SeccionalDaoImp;
import dao.TipoHorarioSeccionalDaoImp;
import entidades.AperturaClausuraSeccional;
import entidades.Casilla;
import entidades.Seccional;
import entidades.TipoHorarioSeccional;
import entidades.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author franciscoornelas
 */
public class AperturaClausuraSeccionalForm extends javax.swing.JFrame {

    Usuario usuario;
    Seccional seccional;
    TipoHorarioSeccional horario;
    Integer idCasilla;
    Date horaRegistro;
    Boolean contieneCasillas;

    /**
     * Creates new form AperturaClausuraSeccionalForm
     */
    public AperturaClausuraSeccionalForm(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        List<Seccional> seccionales = new SeccionalDaoImp().obtenerSeccionales();
        for (Seccional seccional : seccionales) {
            jCBSeccional.addItem(seccional.getSeccional());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFClausura = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCBSeccional = new javax.swing.JComboBox();
        jBClausura = new javax.swing.JButton();
        jCBCasilla = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCBTipoHorario = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seccional");

        jLabel2.setText("Tipo horario");

        jLabel3.setText("Horario");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Registrar horario");

        jCBSeccional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBSeccionalItemStateChanged(evt);
            }
        });
        jCBSeccional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeccionalActionPerformed(evt);
            }
        });

        jBClausura.setText("Tiempo");
        jBClausura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClausuraActionPerformed(evt);
            }
        });

        jCBCasilla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBCasillaItemStateChanged(evt);
            }
        });
        jCBCasilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCasillaMouseClicked(evt);
            }
        });
        jCBCasilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCasillaActionPerformed(evt);
            }
        });
        jCBCasilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBCasillaKeyPressed(evt);
            }
        });

        jLabel5.setText("Casilla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBCasilla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelar))
                            .addComponent(jTFClausura, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jCBSeccional, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBTipoHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBClausura)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSeccional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCasilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBTipoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFClausura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBClausura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSeccionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeccionalActionPerformed
        // TODO add your handling code here:
        Seccional seccional = new SeccionalDaoImp().obtenerSeccionalPorNombre(jCBSeccional.getSelectedItem().toString());
        if (seccional == null) {
            JOptionPane.showMessageDialog(null, "El seccional no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.seccional = seccional;
            //Cargar casillas            
            List<Casilla> casillas = new CasillaDaoImp().obtenerCasillasPorSeccional(seccional.getIdSeccional());
            if (casillas==null || casillas.isEmpty()) {
                this.contieneCasillas = false;
                jCBCasilla.removeAllItems();
                JOptionPane.showMessageDialog(null, "El seccional no tiene casillas", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.contieneCasillas = true;
                jCBCasilla.removeAllItems();
                for (Casilla casilla : casillas) {
                    jCBCasilla.addItem(casilla.getIdCasilla() + ":" + casilla.getNombreCasilla());
                }
            }

        }
    }//GEN-LAST:event_jCBSeccionalActionPerformed

    private void jCBSeccionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBSeccionalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeccionalItemStateChanged

    private void jBClausuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClausuraActionPerformed
        // TODO add your handling code here:
        java.util.Date uDate = new java.util.Date();
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        String newstring = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(sDate);
        jTFClausura.setText(newstring);
        this.horaRegistro = sDate;
    }//GEN-LAST:event_jBClausuraActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        if (this.idCasilla != 0) {
            if (this.horario != null) {
                if (this.horaRegistro != null) {
                    AperturaClausuraSeccional registro = new AperturaClausuraSeccional();
                    registro.setIdUsuario(this.usuario.getIdUsuario());
                    registro.setIdSeccional(this.seccional.getIdSeccional());
                    registro.setIdTipoHorarioSeccional(this.horario.getIdTipoHorarioSeccional());
                    registro.setIdCasilla(this.idCasilla);
                    registro.setHoraRegistro(this.horaRegistro);
                    if (new AperturaClausuraSeccionalDaoImp().agregarAperturaClausura(registro)) {
                        JOptionPane.showMessageDialog(null, "Se registró correctamente el horario", "Registro éxitoso", JOptionPane.OK_OPTION);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Registre la hora que desea guardar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione el tipo de horario", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la casilla", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBCasillaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBCasillaItemStateChanged
        // TODO add your handling code here:
        //Checar que hay registro de horario,

    }//GEN-LAST:event_jCBCasillaItemStateChanged

    private void jCBCasillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBCasillaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCasillaKeyPressed

    private void jCBCasillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCasillaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCBCasillaMouseClicked

    private void jCBCasillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCasillaActionPerformed
        // TODO add your handling code here:
        if (jCBCasilla.getSelectedItem() != null) {
            if (this.contieneCasillas) {
                if (jCBCasilla.getSelectedItem().toString() != null) {
                    Integer idCasilla = obtenerIdCasilla(jCBCasilla.getSelectedItem().toString());
                    this.idCasilla = idCasilla;
                    List<AperturaClausuraSeccional> apertura = new AperturaClausuraSeccionalDaoImp().obtenerRegistrosPorCasilla(idCasilla);
                    jCBTipoHorario.removeAllItems();
                    if (apertura == null) {
                        //Mostrar horario de apertura solamente 
                        TipoHorarioSeccional tipoHorario = new TipoHorarioSeccionalDaoImp().obtenerTipoHorario(1);
                        jCBTipoHorario.addItem(tipoHorario.getTipoHorarioSeccional());
                        this.horario = tipoHorario;
                    } else {
                        if (apertura.size() == 2) {
                            JOptionPane.showMessageDialog(null, "La casilla ya registró su horario de apertura y clausura", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            //Mostrar horario de clausura solamente
                            TipoHorarioSeccional tipoHorario = new TipoHorarioSeccionalDaoImp().obtenerTipoHorario(2);
                            jCBTipoHorario.addItem(tipoHorario.getTipoHorarioSeccional());
                            this.horario = tipoHorario;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jCBCasillaActionPerformed
    private Integer obtenerIdCasilla(String texto) {
        Integer idCasilla;
        idCasilla = Integer.parseInt(texto.split(":")[0]);
        return idCasilla;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBClausura;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox jCBCasilla;
    private javax.swing.JComboBox jCBSeccional;
    private javax.swing.JComboBox jCBTipoHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTFClausura;
    // End of variables declaration//GEN-END:variables
}
