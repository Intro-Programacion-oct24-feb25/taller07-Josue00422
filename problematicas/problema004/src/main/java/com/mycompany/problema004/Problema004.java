/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema004;

/**
 *
 * @author USUARIO
 */
public class Problema004 {

    public static void main(String[] args) {
        double resultado = 1.0;
        int denominador = 3;
        int i = 0;

        System.out.print("Operaciones: 1 ");

        while (i < 7) {
            if (i % 2 == 0) {

                System.out.print("- 1/" + denominador + " ");
                resultado -= 1.0 / denominador;

            } else {

                System.out.print("+ 1/" + denominador + " ");
                resultado += 1.0 / denominador;
            }

            denominador += 2;
            i = i + 1;
        }

        System.out.println("\nResultado de la serie: " + resultado);
    }
    
}

    
