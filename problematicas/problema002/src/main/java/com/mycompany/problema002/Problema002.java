/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema002;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema002 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        datos.useLocale(Locale.US);
        int numero = 2;
        int incremento = 4;
        int limite = 10;
        int contador = 1;

        System.out.println("Serie numerica:");
        while (contador <= limite) {

            System.out.println(numero);

            numero += incremento;

            incremento += 2;

            contador++;

        }
    }
}  