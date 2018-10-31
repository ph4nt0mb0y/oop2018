package week5_6;

public class Square extends Rectangle{
    private int side;
    public Square(){
        super();
        side =0;
        Point a = super.getLeftAbove();
        Point b = new Point();
        b.setX(a.getX()+side);
        b.setY(a.getY()-side);
        super.setRightUnder(b);
    }
    public void MoveTo(Point p){
        Point b = new Point();
        b.setX(p.getX()+side);
        b.setY(p.getY()-side);
        super.moveTo(p, b);
    }
    public void MoveToRandom(){
        Point a = new Point();
        a.moveToRandomm();
        Point b = new Point();
        b.setX(a.getX()+side);
        b.setY(a.getY()-side);
        super.moveTo(a, b);
    }
    public String toString(){
        return "Square";
    }
    
}
