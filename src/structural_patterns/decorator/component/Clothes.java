package structural_patterns.decorator.component;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/14
 * TIme: 15:54
 */
public class Clothes extends BaseComponent{
    protected BaseComponent baseComponent;
    @Override
    public void operation(){
        if (baseComponent != null)
            baseComponent.operation();
    }

    // 穿衣服
    public void wearClothes(BaseComponent baseComponent){
        this.baseComponent = baseComponent;
    }
}
