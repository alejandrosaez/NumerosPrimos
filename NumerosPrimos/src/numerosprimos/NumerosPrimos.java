/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumerosPrimos {
        //devuelve true si es primo, falsa no lo es.
    public static boolean CompruebaPrimo(int num1){
        boolean primo = true;
        
        for(int i=2;i<num1;i++){
            
            if (num1 % i==0){
                primo = false;
                i=num1+1;
            }
        }
        return primo;
    }
     public static int SiguientePrimo(int num1){
        int primo=0;
        boolean bandera=true;
        
        for(int i=(num1+1);bandera==true;i++){
                if (CompruebaPrimo(i)){
                    bandera=false;
                    primo=i;
                }
            }
            
                return primo;
      }  
           
     
     
        
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        boolean bandera = true;
        int num1=0;
        
        while (bandera){
            System.out.println("dime numero");
            num1 = leer.nextInt();
        
        if (CompruebaPrimo(num1)){
             System.out.println("el numero "+num1+" es primo");
             System.out.println("el siguiente primo es " + SiguientePrimo(num1));
        }else{
            System.out.println("el numero "+num1+" no es primo");
             System.out.println("el siguiente primo es " + SiguientePrimo(num1));
        }
        if (num1 ==0){
            bandera=false;
        }
        
        }
        
        
    }
    
}
