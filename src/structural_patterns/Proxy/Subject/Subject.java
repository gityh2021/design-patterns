package structural_patterns.Proxy.Subject;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/15
 * TIme: 10:10
 */
public class Subject {
    private String name;
    public void request(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
