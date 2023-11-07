/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("imprime el primer numero entero positivo");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero entero positivo");
        int num2 = scanner.nextInt();
        if (num1 <= num2){
            for  (int i=num1; i<=num2; i++ ){
                System.out.println(i+ "");
                
            }
        }
       
    }
    
}
