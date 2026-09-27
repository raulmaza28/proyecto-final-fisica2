/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fase1proyectofinalfisica;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Fase1proyectoFinalFisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        double valor;
        double resultado;
        String prefijo;

        System.out.print("Ingrese el valor: ");
        valor = entrada.nextDouble();

        double valorAbsoluto = Math.abs(valor);

        if (valorAbsoluto >= 1_000_000_000_000_000_000_000_000.0) {
            resultado = valor / 1_000_000_000_000_000_000_000_000.0;
            prefijo = "Y";

        } else if (valorAbsoluto >= 1_000_000_000_000_000_000_000.0) {
            resultado = valor / 1_000_000_000_000_000_000_000.0;
            prefijo = "Z";

        } else if (valorAbsoluto >= 1_000_000_000_000_000_000.0) {
            resultado = valor / 1_000_000_000_000_000_000.0;
            prefijo = "E";

        } else if (valorAbsoluto >= 1_000_000_000_000_000.0) {
            resultado = valor / 1_000_000_000_000_000.0;
            prefijo = "P";

        } else if (valorAbsoluto >= 1_000_000_000_000.0) {
            resultado = valor / 1_000_000_000_000.0;
            prefijo = "T";

        } else if (valorAbsoluto >= 1_000_000_000.0) {
            resultado = valor / 1_000_000_000.0;
            prefijo = "G";

        } else if (valorAbsoluto >= 1_000_000.0) {
            resultado = valor / 1_000_000.0;
            prefijo = "M";

        } else if (valorAbsoluto >= 1_000.0) {
            resultado = valor / 1_000.0;
            prefijo = "k";

        } else if (valorAbsoluto >= 100.0) {
            resultado = valor / 100.0;
            prefijo = "h";

        } else if (valorAbsoluto >= 10.0) {
            resultado = valor / 10.0;
            prefijo = "da";

        } else if (valorAbsoluto >= 1.0) {
            resultado = valor;
            prefijo = "";

        } else if (valorAbsoluto >= 0.1) {
            resultado = valor / 0.1;
            prefijo = "d";

        } else if (valorAbsoluto >= 0.01) {
            resultado = valor / 0.01;
            prefijo = "c";

        } else if (valorAbsoluto >= 0.001) {
            resultado = valor / 0.001;
            prefijo = "m";

        } else if (valorAbsoluto >= 0.000001) {
            resultado = valor / 0.000001;
            prefijo = "µ";

        } else if (valorAbsoluto >= 0.000000001) {
            resultado = valor / 0.000000001;
            prefijo = "n";

        } else if (valorAbsoluto >= 0.000000000001) {
            resultado = valor / 0.000000000001;
            prefijo = "p";

        } else if (valorAbsoluto >= 0.000000000000001) {
            resultado = valor / 0.000000000000001;
            prefijo = "f";

        } else if (valorAbsoluto >= 0.000000000000000001) {
            resultado = valor / 0.000000000000000001;
            prefijo = "a";

        } else if (valorAbsoluto >= 0.000000000000000000001) {
            resultado = valor / 0.000000000000000000001;
            prefijo = "z";

        } else {
            resultado = valor / 0.000000000000000000000001;
            prefijo = "y";
        }

        System.out.println("Resultado: " + resultado + " " + prefijo);
    }
}
      
    

