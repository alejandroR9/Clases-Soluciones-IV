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
public class FiguraR {
    
    public static void main(String[] args){
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Ingresar Base");
        double base=scn.nextDouble();
        System.out.println("Ingresar Altura");
        double altura=scn.nextDouble();
        
        double area=base*altura/2;
        
        System.out.println("Area:"+area);
        
    }
    
    
    
}
