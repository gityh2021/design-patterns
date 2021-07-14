package structural_patterns.decorator.component;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/14
 * TIme: 15:59
 */
public class Coat extends Clothes{
    private String coatBranch;
    public Coat(String coatBranch){
        this.coatBranch = coatBranch;
    }
    @Override
    public void operation(){
        super.operation();
        System.out.println("穿上" +coatBranch+ "的衣服！");
    }
}
