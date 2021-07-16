package structural_patterns.Proxy.Subject;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/15
 * TIme: 10:09
 */
public class Proxy extends Subject{
    RealSubject realSubject = new RealSubject();
    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void request(){
        System.out.print(this.getName());
        System.out.println("为" + realSubject.getName() + "代理");
        realSubject.request();
    }
}
