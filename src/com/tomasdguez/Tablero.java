/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasdguez;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TomDomGom
 */
public class Tablero {
        // Variables atributos de la pantalla del juego.
    JPanel pantallaJuego;
    JLabel fondoJuego;
    JLabel cartas[][];
    int cartasParejas [][];
    int cartasParejasAux [][];
    String jugador;
    
    //Variable aleatorio
    Random aleatorio;
}
