package structural_patterns.decorator.component;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/14
 * TIme: 15:52
 */
public class BaseComponent {
    private String name;
    public void operation(){
        System.out.println(name + "今天刚刚起床了,have a good day！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
