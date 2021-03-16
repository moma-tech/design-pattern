package top.momatech.dpdemo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * DynamicProxy Dynamic Proxy
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class DynamicProxy implements InvocationHandler {
  private Object target;

  private DynamicProxy(Object obj) {
    target = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result;
    if (args.length > 0) {
      StringBuilder inputs = new StringBuilder("Inputs : ");
      for (int i = 0; i < args.length; i++) {
        inputs.append(args[i].toString()).append(",");
      }
      System.out.println(inputs.toString());
    }
    result = method.invoke(target, args);
    return result;
  }

  public static Object getProxy(Object obj) throws Exception {
    return Proxy.newProxyInstance(
        obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new DynamicProxy((obj)));
  }
}
