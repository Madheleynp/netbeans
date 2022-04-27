/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reformada;


import java.util.Scanner;


 
public class main {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int id = 0 ;
        String nombre;
        String apellido ;
        
         System.out.println("Digite id del padre: ");
         id = entrada.nextInt ();
         
         System.out.println("Digite nombre del padre: ");
         nombre = entrada.next();
         
         System.out.println("Digite apellido del padre: ");
         apellido = entrada.next();
         
         
         System.out.println("Digite el id del estudiante: ");
         id = entrada.nextInt ();
         
         System.out.println("Digite el nombre del estudiante: ");
         nombre = entrada.next();
         
         System.out.println("Digite el apellido el estudiante: ");
         apellido = entrada.next();
         

         System.out.println("Digite id del docente: ");
         id = entrada.nextInt ();
         
         System.out.println("Digite nombre del docente: ");
         nombre = entrada.next();
         
         System.out.println("Digite apellido del docente: ");
         apellido = entrada.next();
         
          padre p1 = new padre (id, nombre, apellido);
         

    
 
}}

