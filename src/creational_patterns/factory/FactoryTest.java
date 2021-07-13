package creational_patterns.factory;

import creational_patterns.factory.operation.AbstractOperation;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/12
 * TIme: 15:11
 */
public class FactoryTest {
    // 简单工厂模式需要与AbstractOperation和OperationFactory类耦合
    public static void main(String[] args) {
        // OperationFactory工厂用来产生各种算法操作，根据多态性质来调用各个子类中重写的方法。
        AbstractOperation operation = OperationFactory.createOperate("+");
        if (operation == null){
            return;
        }
        double a = 10.0, b = 2.0;
        // 加法
        operation.setFirst_number(a);
        operation.setSecond_number(b);
        System.out.println(operation.getResult());

        // 除法
        operation = OperationFactory.createOperate("/");
        operation.setFirst_number(a);
        operation.setSecond_number(b);
        System.out.println(operation.getResult());
    }
}
