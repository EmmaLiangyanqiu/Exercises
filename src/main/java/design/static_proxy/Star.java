package design.static_proxy;

/**
 * Created by Emma on 2018/8/16.
 */
public class Star implements ProxyMeet {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("签名");
        System.out.println("离开");
    }
}
