package top.momatech.dpdemo.proxy.staticproxy;

/**
 * Client Proxy Client
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class Client {

  public static void main(String[] args) {
    AddOperation addOperation = new AddImpl();
    System.out.println(addOperation.doAdd(1, 2));
    AddOperation addProxy = new AddProxy(new AddImpl());
    System.out.println(addProxy.doAdd(1,2));
  }
}
