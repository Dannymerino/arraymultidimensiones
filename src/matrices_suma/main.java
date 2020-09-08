
package matrices_suma;

import java.util.Arrays;

public class main {
    public static void main(String[]args){
    
    int [][] mA = {{1,2,3}
                  ,{4,5,6}
                  ,{7,8,9}};
    
     int [][] mB = {{1,2,3}
                  ,{4,5,6}
                  ,{7,8,9}};
    
     int [][] resultado;
     
     Matrices_suma ms = new Matrices_suma(mA, mB);
     
        try {
            resultado=ms.sumamatriz();
            System.out.println("Suma de matriz A+B");
            for(int[]v:resultado){
            System.out.println(Arrays.toString(v));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
        System.exit(0);  
    
    
    }


   }
    
    
    
    

