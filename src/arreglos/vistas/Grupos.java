/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.vistas;

import arreglos.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author christian
 */
public class Grupos extends javax.swing.JInternalFrame {

    Carrera tics;

    public Grupos(Carrera tics) {
        initComponents();
        this.tics = tics;
        cargarTabla();

        Grupo[] grupos = this.tics.getGrupos();
        for (int i = 0; i < grupos.length; i++) {
            if (grupos[i] != null) {
                listaGrupos.addItem(grupos[i].getNombre());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNoAlumnos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrupos = new javax.swing.JTable();
        listaGrupos = new javax.swing.JComboBox<>();

        setClosable(true);
        getContentPane().setLayout(null);

        jLabel2.setText("Grupos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 20, 40, 16);

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 80, 16);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(30, 120, 110, 22);
        getContentPane().add(txtNoAlumnos);
        txtNoAlumnos.setBounds(180, 120, 70, 22);

        jLabel4.setText("No Alumnos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 90, 80, 16);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(310, 120, 79, 25);

        tablaGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaGrupos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 440, 200);

        getContentPane().add(listaGrupos);
        listaGrupos.setBounds(350, 30, 31, 22);

        setBounds(0, 0, 530, 473);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        int numero = Integer.valueOf(txtNoAlumnos.getText());
        tics.crearNuevoGrupo(numero, nombre);
        cargarTabla();
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Alumnos Activos");
        tabla.addColumn("Tamaño Grupo");

        Grupo[] grupos = this.tics.getGrupos();
        for (int i = 0; i < grupos.length; i++) {
            if (grupos[i] != null) {
                Object[] datos = new Object[3];
                datos[0] = grupos[i].getNombre();
                datos[1] = grupos[i].getNoAlumnos();
                datos[2] = grupos[i].getTamanoGrupo();
                tabla.addRow(datos);
            }
        }
        tablaGrupos.setModel(tabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaGrupos;
    private javax.swing.JTable tablaGrupos;
    private javax.swing.JTextField txtNoAlumnos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
