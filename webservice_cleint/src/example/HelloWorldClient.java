package example;

import com.yao.webserviceclient.HelloWorldServiceLocator;

import java.rmi.activation.Activator;

/**
 * Created by shanyao on 2018/3/21.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
      Activator service = locator.get();
      // If authorization is required
      //((HelloWorldSoapBindingStub)service).setUsername("user3");
      //((HelloWorldSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      service.businessMethod();
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
