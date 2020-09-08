
package matrices_suma;

/**
 *
 * @author Danny
 */
public class Matrices_suma {

    private int [][] mA;
    private int [][] mB;    

    public Matrices_suma(){
    }
    
    public Matrices_suma(int [][] mA, int [][] mB){
    
        this.mA = mA;
        this.mB = mB;
    }

    public int[][] getmA() {
        return mA;
    }

    public void setmA(int[][] mA) {
        this.mA = mA;
    }

    public int[][] getmB() {
        return mB;
    }

    public void setmB(int[][] mB) {
        this.mB = mB;
    }
    public int [][] sumamatriz() throws Exception{
       int[][] mResult = new int [mA.length][mA[0].length];
       if(mA.length==mB.length && mA[0].length==mB[0].length){ 
        for(int row=0;row<mA.length;row++){
         
            for(int col=0; col<mA[row].length;col++){
             
                mResult[row][col]=mA[row][col]+mB[row][col];
            }
        
        }
       }else{
        throw new Exception("El tamaño de las matrices no son iguales");
       
       }
        
        return mResult;
    
    }

}


