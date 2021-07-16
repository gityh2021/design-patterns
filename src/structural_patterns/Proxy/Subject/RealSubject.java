package structural_patterns.Proxy.Subject;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/15
 * TIme: 10:09
 */
public class RealSubject extends Subject{
    @Override
    public void request(){
        System.out.println(this.getName() + "送花给娇娇~");
    }

}
