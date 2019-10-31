/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FiguraOc {
    
     public static void main(String[] args){
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Ingresar Perimetro");
        double perimetro=scn.nextDouble();
        System.out.println("Ingresar Apotema");
        double apotema=scn.nextDouble();
        
        double area=perimetro*apotema/2;
        
        System.out.println("Area:"+area);
        
    }
}
