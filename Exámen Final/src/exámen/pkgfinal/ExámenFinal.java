/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exámen.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Mariano Rack
 */
public class ExámenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        System.out.println("***************");
        System.out.println("*1. Problema 1*");
        System.out.println("*2. Problema 2*");
        System.out.println("*3. Problema 3*");
        System.out.println("*4. Salir*");
        System.out.println("***************");
        while (n!=4){
            System.out.println("Ingrese su opción");
             Scanner input = new Scanner(System.in);
             n= input.nextInt();
             switch(n){
                 case 1 ->{
                     int n1,n2;
                     System.out.println("Ingrese su primer número");
             Scanner input1 = new Scanner(System.in);
              n1= input.nextInt();
               System.out.println("Ingrese su segundo número");
             Scanner input2 = new Scanner(System.in);
              n2= input.nextInt();
              if(n1>=n2){
                  System.out.println("El número mayor es: " + n1);
              }
              else{
                  System.out.println("El número mayor es: " + n2);
              }
              break;
                 }
                 case 2->{
                     
                     System.out.print("Introduce el numero de la base: ");
                     int nu;
        int num = input.nextInt();
        input.nextLine();

        System.out.println();
        for(int altura = 1; altura<=Math.ceil((float)num/2); altura++){
            //Espacios en blanco
            for(int blanco = 1; blanco<=num-altura; blanco++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

        break;
                 }
                 case 3 ->{
                      
                     int v;
                     System.out.println("Seleccione su número de vacas");
                     System.out.println("1. 8 vacas");
                     System.out.println("2. 10 vacas");
                     v = input.nextInt();
                     if(v==1){
                        int[] vacas;
                      vacas=new int[8];
                      int[] pesos;
                      pesos=new int[8];
                      vacas [0]=223;
                      pesos[0]=30;
                      vacas [1]=243;
                      pesos[1]=34;
                        vacas [2]=100;
                      pesos[2]=28;
                      vacas [3]=200;
                      pesos[3]=45;
                      vacas [4]=200;
                      pesos[4]=31;
                      vacas [5]=155;
                      pesos[5]=50;
                        vacas [6]=300;
                      pesos[6]=29;
                      vacas [7]=150;
                      pesos[7]=1;
                     int nu = vacas.length;  
        for (int j = 1; j < nu; j++) {  
            int key = vacas[j];  
            int i = j-1;  
            while ( (i > -1) && ( vacas [i] > key ) ) {  
                vacas [i+1] = vacas [i];  
                i--;  
            }  
            vacas[i+1] = key;  
        } 
        int nu2=pesos.length;
        for (int j = 1; j < nu2; j++) {  
            int key = pesos[j];  
            int i = j-1;  
            while ( (i > -1) && ( pesos [i] > key ) ) {  
                pesos [i+1] = pesos [i];  
                i--;  
            }  
            pesos[i+1] = key;  
        } 
         for(int i:pesos){    
            System.out.println(i+" ");    
        } 
                         System.out.println("-------");
           for(int i:vacas){    
            System.out.println(i+" ");    
        } 
                     }
                     else if (v==2){
                         
                     }
                     else{
                         System.out.println("Entrada errónea");
                     }
                 }
             }
        }
    }
    
}
