/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosu3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_ejercicio2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int residuo = 0;
                
        System.out.println("Introduce el primer numero entero positivo");
        num1 = input.nextInt(); 
        System.out.println("Introduce el segundo numero entero positivo");
        num2 = input.nextInt(); 
        
        System.out.println("-----");
        if(num1 >= num2){
            
            for (int i = num2; i <= num1; i++) {
                
                residuo = i % 2;
                if(residuo != 0)
                continue;
                System.out.println(i);
                
            }
            
        }else{
            
            for (int i = num1; i <= num2; i++) {
                residuo = i % 2;
                if(residuo != 0)
                continue;
                System.out.println(i);
            }
            
        }
}
}
