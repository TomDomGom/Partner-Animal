/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasdguez;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TomDomGom
 */
public class PartnerAnimal extends Application {
    // Creamos las variables de nuestro juego.
    // Donde crearemos las ventanas.
    JFrame pantalla;
    
    // Variables atributos de la pantalla de inicio.
    JPanel pantallaInicio;
    JLabel fondoInicio;
    JLabel botonJugar;
    
    // Variables atributos de la pantalla del juego.
    JPanel pantallaJuego;
    JLabel fondoJuego;
    
    @Override
    public void start(Stage primaryStage) {
        
            // Conexión con la clase Tablero.
            Tablero tablero = new Tablero();
            // Nombre a mostrar en la ventana
            pantalla = new JFrame("Partner Animal");

            // Tamaño de nuestra ventana del juego *Estática.
            pantalla.setSize(800, 600); 

            // Con esta propiedad podemos colocar los objetos donde queramos.
            pantalla.setLayout(null);

            //Con esta propiedad conseguimos que el programa no ejecute en segundo plano al cerrar.
            pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Con esta propiedad conseguimos que aparezca centrada en el ordenador.
            pantalla.setLocationRelativeTo(null);

            //Desavilitamos el maximizado de la ventana.
            pantalla.setResizable(false);

            //Continuamos dando las propiedades al Panel.
            pantallaInicio = new JPanel();
            pantallaInicio.setSize(pantalla.getWidth(), pantalla.getHeight());
            pantallaInicio.setLayout(null);

            // Colocación del panel en pantalla.
            pantallaInicio.setLocation(0, 0);
            pantallaInicio.setVisible(true);
            
            // Creación del Boton de Juego.
            botonJugar = new JLabel();
            botonJugar.setSize(pantalla.getWidth(), pantalla.getHeight());
            botonJugar.setLocation(0, 0);
            // Añadimos la imagen del boton.
            botonJugar.setIcon(new ImageIcon("src/com/img/botonPlay.png"));
            botonJugar.setVisible(true);
            pantallaInicio.add(botonJugar);
            
            //Continuamos con el fondo de la presentación.
            fondoInicio = new JLabel();
            fondoInicio.setSize(pantalla.getWidth(), pantalla.getHeight());
            fondoInicio.setLocation(0, 0);
            //Añadimos imagen para el fondo.
            fondoInicio.setIcon(new ImageIcon("src/com/img/fondoInicio.png"));
            fondoInicio.setVisible(true);
            // Mostramos el fondo de presentación.
            pantallaInicio.add(fondoInicio);

            
            //Pasamos a crear ahora la interfaz para el juego.
            //Continuamos dando las propiedades al Panel.
            pantallaJuego = new JPanel();
            pantallaJuego.setSize(pantalla.getWidth(), pantalla.getHeight());
            pantallaJuego.setLayout(null);

            // Colocación del panel en pantalla.
            pantallaJuego.setLocation(0, 0);
            pantallaJuego.setVisible(true);

            // Colocación del Fondo de juego.
            fondoJuego = new JLabel();
            fondoJuego.setSize(pantalla.getWidth(), pantalla.getHeight());
            fondoJuego.setLocation(0, 0);
            //Añadimos imagen para el fondo.
            fondoJuego.setIcon(new ImageIcon("src/com/img/fondoJuego.png"));
            fondoJuego.setVisible(true);

            // Mostramos el fondo del Juego.
            pantallaJuego.add(fondoJuego);
            
            // Creamos el evento para el boton jugar. Es decir cuando demos click en jugar o en la pantalla.
            botonJugar.addMouseListener(new MouseAdapter() {
                
                // Metodo para el click del raton.
                @Override
                public void mousePressed(MouseEvent e) {
                    //Acción para ocultar el fondo de inicio y mostrar el del juego.
                    pantallaInicio.setVisible(false);
                    pantalla.add(pantallaJuego);
                    pantallaJuego.setVisible(true);
                    tablero.MatrizCartas();
                }
            });
            
            // Añadimos el panel Presentación a la ventana.
            pantalla.add(pantallaInicio);
            
            // Con esta propiedad mostramos la ventana. *Siempre la pondremos al final del constructor.
            pantalla.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
