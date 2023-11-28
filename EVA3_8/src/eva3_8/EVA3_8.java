/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8 {
    final static String USUARIO = "TUTTI";
    final static String PASSWORD ="FRUTTI";
    private static String usu;
    private static String pwd;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input = new Scanner (System.in);
     do{
         System.out.println("usuario: ");
         usu = input.nextLine();
         System.out.println("contraseña: ");
         pwd = input.nextLine();
         
     }while(!validarUsuario(usu,pwd));
        System.out.println("WELCOME TO THE SYSTEM <3");
    }
  public static boolean validarUsuario (String usuario,String pwd){
      if (usuario.equals(USUARIO) && pwd.equals (PASSWORD))
          return true; 
        else
          
          return false;
      
    
  }
    
}
