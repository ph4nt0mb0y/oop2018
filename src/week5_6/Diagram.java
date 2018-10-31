/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;



public class Diagram {

    private Shape[] x;
    
    public Diagram(){
        

        x = new Shape[Layer.MAX];
        x[0] = new Circle();
        x[1] = new Rectangle();
        x[2] = new Triangle();
        x[3] = new Circle();
        
    }


    public void delCircle(){
        for(int i=0;x[i]!=null;i++){
            if(x[i] instanceof Circle){
                x[i] = new Shape();
            }
        }
    }
    public void print(){
       for(int i=0;x[i]!=null;i++){
           System.out.println(x[i].toString());
       }
    }
    
    public static void main(String args[]) {
        Diagram dia = new Diagram();
        //dia.delCircle();
        dia.print();
    } 
    
    

     
}

    


