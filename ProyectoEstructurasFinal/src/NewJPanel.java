/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 * Clase NewJPanel
 * 
 * Esta clase representa un panel de calculadora que permite a los usuarios 
 * realizar operaciones aritméticas simples. La calcluladora proporciona 
 * botones para los dígitos del '0' al '9' y de operadores permite, suma, 
 * resta, multiplicación y división, así como paréntesis y exponente. Los 
 * números y operadores ingresados se muestran en un área de texto, y al 
 * presionar el boton "=" se evalúa la expresión matemática ingresada y se 
 * muestra el resultado.
 * </pre>
 * @version 1.0
 * @see #initComponents()
 * @author Ana Sofía Conde Islas, Carmen Sofía Delgado Escobar, Maria Alejandra Galicia Almaraz, Leonargo García Bernal, Alejandro Salas Aguilar y Jimena San German Elizondo
 */
public class NewJPanel extends javax.swing.JPanel {
    private String argumento= "";


    /**
     * <pre>
     * Este constructor inicializa un nuevo panel y se 
     * inicializan los componentes gráficos del panel.
     * @see initComponents()
     * </pre>
     */
    public NewJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * <pre>
     * Inicializa y configura todos los componentes de la interfaz gráfica de la calculadora.
     * Se establecen los botones numéricos, de operaciones y de control, así como también
     * se definen los eventos asociados a cada uno de ellos.
     * </pre>
     */
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        division = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        exponente = new javax.swing.JButton();
        pizq = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        pder = new javax.swing.JButton();

        jButton1.setText("jButton1");

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        multiplicacion.setText("*");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        jButton.setText("1");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        exponente.setText("^");
        exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponenteActionPerformed(evt);
            }
        });

        pizq.setText("(");
        pizq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizqActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        pder.setText(")");
        pder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pizq, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(suma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pizq, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Limpia el argumento y establece el texto del resultado como vacío.
     * @param evt El evento de acción que desencadena la operación de borrar.
     */
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        argumento = "";
        resultado.setText(argumento);
    }//GEN-LAST:event_borrarActionPerformed

    /**
     * <pre>
     * Agrega el dígito '0' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '0' de la calculadora.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '0'.
     */
    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        argumento= argumento +"0";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton0ActionPerformed
    
    /**
     * <pre>
     * Agrega el dígito '9' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '9' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '9'.
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      argumento= argumento + "9";
      resultado.setText(argumento);
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '5' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '5' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '5'.
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        argumento= argumento +"5";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '3' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '3' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '3'.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       argumento= argumento +"3";
       resultado.setText(argumento);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '2' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '2' de la calculadora.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '2'.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        argumento= argumento +"2";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '1' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '1' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '1'.
     */
    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        argumento= argumento +"1";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButtonActionPerformed

    /**
     * <pre>
     * Agrega el operador de suma '+' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '+' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del operador de suma.
     */
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        argumento= argumento +"+";
        resultado.setText(argumento);
    }//GEN-LAST:event_sumaActionPerformed

    /**
     * <pre>
     * Agrega el operador de resta '-' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '-' de la calculadora.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del operador de resta.
     */
    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        argumento= argumento +"-";
        resultado.setText(argumento);
    }//GEN-LAST:event_restaActionPerformed

    /**
     * <pre>
     * Agrega un punto decimal '.' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '.' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del punto decimal '0'.
     */
    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        argumento= argumento +".";
        resultado.setText(argumento);
    }//GEN-LAST:event_puntoActionPerformed

    /**
     * <pre>
     * Agrega el dígito '7' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '7' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '7'.
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        argumento= argumento +"7";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '4' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '4' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '4'.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        argumento= argumento +"4";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '6' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '6' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '6'.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        argumento= argumento +"6";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * <pre>
     * Agrega el dígito '8' al argumento y actualiza el área de texto. Este 
     * método se actualiza cuando haces clic en el botón '8' de la calculadora. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del dígito '8'.
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        argumento= argumento +"8";
        resultado.setText(argumento);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * <pre>
     * Evalúa la expresión matemática ingresada en la calculadora y muestra el 
     * resultado en el área de texto.
     * </pre>
     * @param evt El evento de acción que desencadena la evaluación de la expresión.
     */
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        Convertir miConversor = new Convertir();
        DePostfijaAResultado postfijo = new DePostfijaAResultado();
        String res = postfijo.dePostfijaAResultado(argumento);
        //String res = postfijo.dePostfijaAResultado(miConversor.getPosfijo().toString());
        resultado.setText(res);
    }//GEN-LAST:event_igualActionPerformed

    /**
     * <pre>
     * Agrega un paréntesis izquierdo "(" al argumento actualmente ingresado en 
     * la calculadora y lo muestra en el área de texto. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del paréntesis izquierdo.
     */
    private void pizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizqActionPerformed
        argumento= argumento +"(";
        resultado.setText(argumento);
    }//GEN-LAST:event_pizqActionPerformed

    /**
     * <pre>
     * Agrega el operador de multiplicación "*" al argumento actualmente 
     * ingresado en la calculadora y actualiza el área de texto para mostrar el 
     * argumento modificado.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del operador de multiplicación.
     */
    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        argumento= argumento +"*";
        resultado.setText(argumento);
    }//GEN-LAST:event_multiplicacionActionPerformed

    /**
     * <pre>
     * Agrega el operador de división "/" al argumento actualmente ingresado en 
     * la calculadora y actualiza el área de texto para mostrar el argumento 
     * modificado.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del operador de división.
     */
    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
       argumento= argumento +"/";
       resultado.setText(argumento);
    }//GEN-LAST:event_divisionActionPerformed

    /**
     * <pre>
     * Agrega el operador de exponente "^" al argumento actualmente ingresado en 
     * la calculadora y actualiza el área de texto para mostrar el argumento 
     * modificado.
     * </pre>
     * @param evt El evento de acción que desencadena la adición del operador de exponente.
     */
    private void exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponenteActionPerformed
        argumento= argumento +"^";
        resultado.setText(argumento);
    }//GEN-LAST:event_exponenteActionPerformed

    /**
     * <pre>
     * Agrega un paréntesis derecho "(" al argumento actualmente ingresado en la 
     * calculadora y lo muestra en el área de texto. 
     * </pre>
     * @param evt El evento de acción que desencadena la adición del paréntesis derecho.
     */
    private void pderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pderActionPerformed
        argumento= argumento + ")";
        resultado.setText(argumento);
    }//GEN-LAST:event_pderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton division;
    private javax.swing.JButton exponente;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton pder;
    private javax.swing.JButton pizq;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JTextArea resultado;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
