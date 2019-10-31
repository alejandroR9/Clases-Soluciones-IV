
package figura;

import java.util.Scanner;

public class FiguraT {
    
    
    public static void main(String[] args){
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Ingresar Base");
        double base=scn.nextDouble();
        
        System.out.println("Ingresar Basemenor");
        double basemenor=scn.nextDouble();
                
        System.out.println("Ingresar Altura");
        double altura=scn.nextDouble();
        
        double area=(base+basemenor)/2*altura;
        
        System.out.println("Area:"+area);
    }
}
