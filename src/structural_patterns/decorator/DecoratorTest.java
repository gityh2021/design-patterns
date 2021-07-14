package structural_patterns.decorator;

import structural_patterns.decorator.component.BaseComponent;
import structural_patterns.decorator.component.Clothes;
import structural_patterns.decorator.component.Coat;
import structural_patterns.decorator.component.Pants;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/14
 * TIme: 16:18
 */
public class DecoratorTest {
    public static void main(String[] args) {
        // 基本类，可以看作一个人，不断往人身上装饰功能
        BaseComponent baseComponent = new BaseComponent();
        baseComponent.setName("杨鸿");

        // 衣服
        Clothes clothes = new Clothes();
        clothes.wearClothes(baseComponent);
        // 新建裤子和衣服
        Pants pants = new Pants("Adidas");
        Coat coat = new Coat("Nike");

        // 装饰模式的调用规则，不断地去封装
        pants.wearClothes(clothes);
        coat.wearClothes(pants);
        coat.operation();

    }


}
