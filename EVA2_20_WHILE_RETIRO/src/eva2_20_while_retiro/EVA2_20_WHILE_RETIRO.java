/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_retiro;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti =1000;
        Scanner input = new Scanner(System.in);
        while(canti >0){
            System.out.println("¿CUANTO DESEAS RETIRAR?");
            int retiro =input.nextInt();
            canti -=retiro;
            System.out.println("TE QUEDAN $"+ canti + "DE SALDO");
            
            
        }
    }
    
}
