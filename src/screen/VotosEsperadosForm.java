/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import dao.CasillaDaoImp;
import dao.SeccionalDaoImp;
import dao.VotoEsperadoDaoImp;
import entidades.Casilla;
import entidades.Seccional;
import entidades.Usuario;
import entidades.VotoEsperado;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author franciscoornelas
 */
public class VotosEsperadosForm extends javax.swing.JFrame {

    Usuario usuario;

    Seccional seccional;

    /**
     * Creates new form VotosEsperadosForm
     */
    public VotosEsperadosForm(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        List<Seccional> seccionales = new SeccionalDaoImp().obtenerSeccionales();
        if (seccionales != null) {
            for (Seccional seccional : seccionales) {
                jCBSeccional.addItem(seccional.getSeccional());
            }
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

        jCBSeccional = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpVotosEsperados = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jCBCasilla = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Votos esperados por casilla");

        jLabel2.setText("Votos esperados");

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

        jLabel3.setText("Seccional");

        jLabel4.setText("Casilla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpVotosEsperados, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jCBCasilla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBSeccional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jCBSeccional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jCBCasilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpVotosEsperados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        VotoEsperado votoEsperado = new VotoEsperado();
        votoEsperado.setIdSeccional(this.seccional.getIdSeccional());
        votoEsperado.setIdUsuario(this.usuario.getIdUsuario());
        votoEsperado.setIdCasilla(obtenerIdCasilla(jCBCasilla.getSelectedItem().toString()));
        votoEsperado.setVotoEsperado((Integer) jSpVotosEsperados.getValue());
        new VotoEsperadoDaoImp().registrarVotoEsperado(votoEsperado);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jCBSeccionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBSeccionalItemStateChanged

    }//GEN-LAST:event_jCBSeccionalItemStateChanged

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBSeccionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeccionalActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Seccional seccional = new SeccionalDaoImp().obtenerSeccionalPorNombre(jCBSeccional.getSelectedItem().toString());
        if (seccional == null) {
            JOptionPane.showMessageDialog(null, "El seccional no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.seccional = seccional;
            //Cargar casillas
            List<Casilla> casillas = new CasillaDaoImp().obtenerCasillasPorSeccional(seccional.getIdSeccional());
            jCBCasilla.removeAllItems();
            if (casillas == null || casillas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El seccional no tiene casillas", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                for (Casilla casilla : casillas) {
                    jCBCasilla.addItem(casilla.getIdCasilla() + ":" + casilla.getNombreCasilla());
                }
            }
        }
    }//GEN-LAST:event_jCBSeccionalActionPerformed
    private Integer obtenerIdCasilla(String valor) {
        return Integer.parseInt(valor.split(":")[0]);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox jCBCasilla;
    private javax.swing.JComboBox jCBSeccional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpVotosEsperados;
    // End of variables declaration//GEN-END:variables
}