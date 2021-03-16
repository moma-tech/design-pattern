package top.momatech.dpdemo.proxy.dynamic;

/**
 * Client Dynamic Client
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class Client {
  public static void main(String[] args) {
    AddImpl add = new AddImpl();
    try {
      AddOperation addOperation = (AddOperation) DynamicProxy.getProxy(add);
      System.out.println(addOperation.doAdd(1, 2));

      MinusOperation minusOperation = (MinusOperation) DynamicProxy.getProxy(new MinusImpl());
      System.out.println(minusOperation.doMinus(2, 1));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
