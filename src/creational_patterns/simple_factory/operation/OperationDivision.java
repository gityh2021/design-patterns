package creational_patterns.simple_factory.operation;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/12
 * TIme: 15:02
 */
public class OperationDivision extends AbstractOperation{
    @Override
    public double getResult() {
        if (super.getSecond_number() == 0) {
            System.out.println("除数不能为0");
            return super.getResult();
        }
        return this.getFirst_number()/this.getSecond_number();
    }
}
