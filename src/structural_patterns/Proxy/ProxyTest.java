package structural_patterns.Proxy;

import structural_patterns.Proxy.Subject.Proxy;
import structural_patterns.Proxy.Subject.RealSubject;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/15
 * TIme: 10:19
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 想要送花的人
        RealSubject realSubject = new RealSubject();
        realSubject.setName("小菜");
        // 代理送花的人
        Proxy proxy = new Proxy(realSubject);
        proxy.setName("戴笠");
        proxy.request();
    }
}
