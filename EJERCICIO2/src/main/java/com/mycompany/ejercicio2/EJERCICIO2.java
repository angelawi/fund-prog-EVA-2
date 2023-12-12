/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("digite una letra: ");
        letra = sc.next().charAt(0);
        
        
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("es vocal");
            case'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'q', 'r', 's', 't', 'v', 'w', 'y', 'z' -> System.out.println("es consonante");
             
                
                
            
        }
    }
}
