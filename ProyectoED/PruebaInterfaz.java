/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
/**
 * <pre>
 * Clase PruebaInterfaz
 * 
 * Clase que contiene el método main para ejecutar la aplicación de la calculadora.
 * Esta clase crea una interfaz gráfica de usuario y agtega el panel principal.
 * </pre>
 * @version 1.0
 * @author Ana Sofía Conde Islas, Carmen Sofía Delgado Escobar, Maria Alejandra Galicia Almaraz, Leonargo García Bernal, Alejandro Salas Aguilar y Jimena San German Elizondo
 * @see NewJPanel
 */
public class PruebaInterfaz {
    
    /**
     * Método principal que inicia la aplicación de la calculadora.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear la instancia de JFrame
        JFrame frame = new JFrame("Calculadora");
        
        // Crear la instancia de NewJPanel
        NewJPanel newJPanel = new NewJPanel();

        // Configurar el tamaño preferido de NewJPanel para que coincida con la calculadora 
        newJPanel.setPreferredSize(new Dimension(470, 450));
        
        
        // Establecer un borde vacío para crear un margen dentro del JFrame
        newJPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // margen de 10 píxeles
        
        // Configurar la operación de cierre para terminar la aplicación cuando se cierre la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Utilizar BorderLayout para agregar componentes
        frame.setLayout(new BorderLayout());
        
        // Agregar NewJPanel al centro del BorderLayout para que quede centrado en el JFrame
        frame.add(newJPanel, BorderLayout.CENTER);
        
        // Ajustar el tamaño de la ventana al contenido
        frame.pack();
        
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        
        // Hacer visible el JFrame
        frame.setVisible(true);
       
    }
    
}
