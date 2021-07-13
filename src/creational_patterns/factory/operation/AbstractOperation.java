package creational_patterns.factory.operation;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/12
 * TIme: 14:47
 */

/**
 * 可以通过继承AbstractOperation来对
 */
public abstract class AbstractOperation {
    private double first_number;
    private double second_number;
    private double result;
    public double getResult(){
        this.result = 0;
        return this.result;
    }
    public double getFirst_number() {
        return first_number;
    }

    public void setFirst_number(double first_number) {
        this.first_number = first_number;
    }

    public double getSecond_number() {
        return second_number;
    }

    public void setSecond_number(double second_number) {
        this.second_number = second_number;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
