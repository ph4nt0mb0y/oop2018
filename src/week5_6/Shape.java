package week5_6;

import java.util.Random;

public class Shape extends Layer {
    Point p;
    private String Color;
    private boolean filled;

    public Shape() {
        p = new Point();
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Shape(String color, boolean filled){
        this.Color=color;
        this.filled=filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public void MoveRandom(){
        Random random = new Random();
        int x=1,y=1;
        while(x>0){
            x= random.nextInt(300);
            y= random.nextInt(300);
            setP(new Point(x,y));
        }

    }
}
