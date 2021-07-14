package structural_patterns.decorator.component;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/14
 * TIme: 16:01
 */
public class Pants extends Clothes{
    private String pantsBranch;
    public Pants(String pantsBranch){
        this.pantsBranch = pantsBranch;
    }
    @Override
    public void operation(){
        super.operation();
        System.out.println("穿上" +pantsBranch+ "的衣服！");
    }
}
