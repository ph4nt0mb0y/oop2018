package week7.task1;
public class ExpressionTest {
    public static void main(String[] args) {
        //String = "(10^2 - 1 + 2*3)^2";
        Expression s1 = new Square(new Numeral(10));
        Expression s2 = new Subtraction(s1, new Numeral(1));
        Expression s3 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression s4 = new Addition(s2, s3);
        Expression s5 = new Square(s4);
        Expression s6 = new Division(new Numeral(1), new Numeral(0));
        System.out.println(s5.toString() + "=" + s5.evaluate());
        System.out.println(s6.toString() + s6.evaluate());
    }
}