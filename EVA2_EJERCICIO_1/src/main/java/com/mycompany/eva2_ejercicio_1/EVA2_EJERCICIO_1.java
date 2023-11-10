/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_EJERCICIO_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("    ingrese el primer numero entereo positivo");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero entero positivo");
       int num2 = input.nextInt();
        System.out.println("numero entero" + num1 +"y"+ num2 + "en orden ascedente");
        if (num1 <= num2){
            for (int i= num1; i<= num2; i++){
                System.out.println(i + "");
                
            }
        } else { System.out.println("el primer numero debe de ser igual o menor al segundo");

}
}
    }
    