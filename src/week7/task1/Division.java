package week7.task1;

public class Division extends BinaryExpression {
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

