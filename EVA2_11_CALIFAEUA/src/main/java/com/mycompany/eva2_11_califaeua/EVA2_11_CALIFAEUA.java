/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_califaeua;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_CALIFAEUA {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ingresa tu calificacion");
        int califa = input.nextInt();
        if ((califa >=90)&& (califa <=100))
            System.out.println("tu calificacion es A");
        else if ((califa >=80) && (califa <= 89))
            System.out.println("tu califacion es B");
            else if ((califa >=70) && (califa <=79))
            System.out.println("tu calificacion es C");
            else if ((califa >=0) && (califa <=69))
                System.out.println("tu calificacion es F");
        
        
        
        
    }
}
