package week5_6;

import java.util.Random;

public class Rectangle extends Shape {
    Point p1, p2;
    private double width;
    private double length;
    public Rectangle() {
        p1 = new Point();
        p2 = new Point();
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double size) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void MoveRandom(){
        Random random = new Random();
        int x1=1,x2=1,y1=1,y2=1;
        while(x1>0){
            x1= random.nextInt(300);
            x2= random.nextInt(300);
            y1= random.nextInt(300);
            y2= random.nextInt(300);
            setP1(new Point(x1,y1));
            setP2(new Point(x2,y2));
        }

    }
}