package webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Emma on 2018/8/8.
 */
@WebService
public class HelloServer {
    @WebMethod
    public String getString(){
        return "hello";
    }

    public static void main(String[] args) {
        HelloServer helloServer=new HelloServer();
        String address="http://localhost:5555/HelloWorld";
        Endpoint.publish(address,helloServer);
        System.out.println("发布成功");
    }
}
