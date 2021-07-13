package creational_patterns.factory;

import com.sun.org.apache.xpath.internal.operations.Operation;
import creational_patterns.factory.operation.AbstractOperation;
import creational_patterns.factory.operation.OperationAdd;
import creational_patterns.factory.operation.OperationDivision;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/12
 * TIme: 15:09
 */
public class OperationFactory {
    public static AbstractOperation createOperate(String s){
        AbstractOperation operation = null;
        switch (s){
            case "+":
                operation = new OperationAdd();
                break;
            case "/":
                operation = new OperationDivision();
                break;
            default:
                System.out.println("请输入合法的符号！");
                break;
        }
        return operation;
    }
}
