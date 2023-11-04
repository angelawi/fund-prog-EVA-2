/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_SWITCH {

    public static void main(String[] args) {
        Scanner nono = new Scanner (System.in);
        System.out.println("indica el numero del mes");
        int mes = nono.nextInt();
        switch(mes){
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
               break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("el mes es agosto");
                break;
            case 9:
                System.out.println("el mes es septiembre");
                break;
            case 10:
                System.out.println("el mes es octubre");
                break;
            case 11:
                System.out.println("el mes es noviembre");
                break;
            case 12:
                System.out.println("el mes es diciembre");
            default:
                System.out.println("wl numero"+mes+"no es un mes valido");
                    
        }
        
        
        
    }
}
