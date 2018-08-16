package design.static_proxy;

/**
 * Created by Emma on 2018/8/16.
 */
public class Company implements ProxyMeet {
    private ProxyMeet proxyMeet;

    public Company(ProxyMeet proxyMeet) {
        this.proxyMeet = proxyMeet;
    }

    @Override
    public void run() {
        System.out.println("布置场地");
        System.out.println("开始");
        proxyMeet.run();
        System.out.println("结束，收拾场地");
    }
}
