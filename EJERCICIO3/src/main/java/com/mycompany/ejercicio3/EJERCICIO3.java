/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num;
        int suma = 0;
        
        System.out.println("Introduce el primer numero entero positivo");
        num = input.nextInt(); 
        
        for (int i = 0; i < num; i++) {
            suma += i;
        }
        System.out.println("La sumatoria es: " + suma);
    } 
    
}
