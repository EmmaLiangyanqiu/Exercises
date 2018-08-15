package webservice.client;

/**
 * Created by Emma on 2018/8/8.
 */
public class HelloClient {
        public static void main(String[] args) {
            WebServerService webServerService=new WebServerService();
            WebServer webServer=webServerService.getWebServerPort();
            String returnStr=  webServer.getString();
            System.out.println(returnStr);
        }
}
