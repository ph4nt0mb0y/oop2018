package week5_6;

public class Layer extends Diagram {
    private Shape[] x;
    public static void main(String[] args) {
        Layer layer = new Layer();
    }
    public void DelTrip(){
        for(int i=0;x[i]!= null;i++){
            if(x[i] instanceof Circle ){
                x[i] = new Shape();
            }
        }
    }

}

