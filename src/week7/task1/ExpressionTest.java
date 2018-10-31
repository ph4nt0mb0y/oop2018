package week7.task1;

import java.util.ArrayList;

public class ExpressionTest {
    public static void main(String[] args) {
        //String = "(10^2 - 1 + 2*3)^2";
        Expression s1 = new Square(new Numeral(10));
        Expression s2 = new Subtraction(s1, new Numeral(1));
        Expression s3 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression s4 = new Addition(s2, s3);
        Expression s5 = new Square(s4);
        Expression s6 = new Division(new Numeral(1), new Numeral(0));
        System.out.println(s5.toString()+"="+s5.evaluate());
        System.out.println(s6.toString()+s6.evaluate());
    }

    public static class Subtraction extends BinaryExpression {
        private Expression left;
        private Expression right;

        public Subtraction(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public Expression left() {
            return left;
        }

        @Override
        public Expression right() {
            return right;
        }

        @Override
        public int evaluate() {
            return left.evaluate() - right.evaluate();
        }

        @Override
        public String toString() {
            return left.toString() + "-" + right.toString();
        }
    }

    public static class Multiplication extends BinaryExpression {
        private Expression left;
        private Expression right;

        public Multiplication(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public Expression left() {
            return left;
        }

        @Override
        public Expression right() {
            return right;
        }

        @Override
        public int evaluate() {
            return left.evaluate() * right.evaluate();
        }

        @Override
        public String toString() {
            return left.toString() + "*" + right.toString();
        }
    }

    public static class Division extends BinaryExpression {
        private Expression left;
        private Expression right;

        public Division(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public Expression left() {
            return left;
        }

        @Override
        public Expression right() {
            return right;
        }

        @Override
        public int evaluate() {
            try {
                return this.left.evaluate() / this.right.evaluate();
            } catch (ArithmeticException e) {
                System.out.print("Lỗi chia cho ");
                return 0;
            }
        }

        @Override
        public String toString() {
            if(this.right.evaluate()==0) return "";
            else return left.toString() + "/" + right.toString() + "=";
        }
    }
}