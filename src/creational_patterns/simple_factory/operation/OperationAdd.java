package creational_patterns.simple_factory.operation;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/12
 * TIme: 14:56
 */
public class OperationAdd extends AbstractOperation {
    @Override
    public double getResult(){
        // 可能有大数相加的需求。
        return this.getFirst_number() + this.getSecond_number();
    }
}
