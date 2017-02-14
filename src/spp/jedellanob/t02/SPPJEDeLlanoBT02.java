/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.t02;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double he; 
      int sue;
      Scanner datos= new Scanner(System.in);
      
        System.out.println("Introduce la cantidad de horas extras trabajadas durante la semana");
        he= datos.nextDouble();
        System.out.println("Introduce el sueldo del trabajador");
        sue= datos.nextInt();
        System.out.println("Introduce la categoría del trabajador");
        System.out.println("Categoría 1");
        System.out.println("Categoría 2");
        System.out.println("Categoría 3");
        System.out.println("Categoría 4");
        
        int op;
        double res;
        op= datos.nextInt();
       
        if(op<5&&op>0)
            
        switch(op) {
            case 1:
                res= sue + (he*30);
                System.out.println("Sueldo de trabajador de categoría uno " + res);
                break;
            case 2:
                res= sue + (he*38);
                System.out.println("Sueldo de trabajador de categoría dos " + res);
                break;
            case 3:
                res= sue + (he*50);
                System.out.println("Sueldo de trabajador de categoría tres " + res);
                break;
            case 4:
                res= sue + (he*70);
                System.out.println("Sueldo de trabajador de categoría cuatro " + res);
                break;                
        }
        else 
        {
            System.out.println("no existe esa categoría");
        }
        
    }
    
}
