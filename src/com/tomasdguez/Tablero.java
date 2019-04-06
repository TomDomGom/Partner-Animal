package com.tomasdguez;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author TomDomGom
 */
public class Tablero {
    // Variables atributos para la matriz de las cartas.
    JLabel cartas[][];
    int cartasParejas [][];
    int cartasParejasAux [][];
    String jugador;
    
    //Variable aleatorio
    Random aleatorio;
    
    // La matriz estará compuesta por 4 filas y 4 columnas
    public void Matriz() {
    //Matriz lógica donde añadiremos las filas y las columnas. de las cartas.
    cartasParejas = new int[4][4];
    cartasParejasAux = new int[4][4];
    aleatorio = new Random();
    
    }
    // Creamos el metodo numerlos aleatorios donde se ubicaran las cartas.
    public void numerosAleatorios() {
        //Creamos la variable acumulador para guardar los resultados.
        int acumulador = 0;

        //Bucler For para las cartas.
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++){
                cartasParejas[i][j] = 0;
                // Matriz Auxiliar de la matriz principal
                cartasParejasAux[i][j] = 0;
            }
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4 ; j++){
                cartasParejas[i][j] = aleatorio.nextInt(8)+1; // Con el +1 añadimos del 0 al 10.
                // Creamos una condición con el do while
                do {
                    //ponemos el acumulador a 0 tras su revision.
                    acumulador = 0;
                    for (int k = 0; k < 4 ; k++) {
                        for (int l = 0; l < 4 ; l++) {
                            //Logica condicional con if (Sentencia).
                            if (cartasParejas [i][j] == cartasParejas[k][l]){
                                acumulador += 1;
                            }  //Final if
                        } //Final bucler for
                    } //Final bucler for
                    //Condicional acumulador
                    if (acumulador == 3){
                        cartasParejas[i][j] = aleatorio.nextInt(8)+1;
                    }
                } while (acumulador == 3);
            }
        } // Final Bucler Primer For.
    } // Final metodo números Aleatorios / Lógica del juego.
    
    //Llamada al metodo numero aleatorio.
    //this.numerosAleatorios();
}
