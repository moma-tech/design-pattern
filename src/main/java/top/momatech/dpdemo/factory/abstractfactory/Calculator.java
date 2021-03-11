package top.momatech.dpdemo.factory.abstractfactory;

import top.momatech.dpdemo.factory.abstractfactory.factory.AddFactory;
import top.momatech.dpdemo.factory.abstractfactory.factory.MinusFactory;

/**
 * Calculator
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/11.
 */
public class Calculator {
  public static void main(String[] args) {
    double a = 1123;
    double b = 222;

    AddFactory addFactory = new AddFactory();
    double c = addFactory.create().getResult(a, b);
    MinusFactory minusFactory = new MinusFactory();
    double d = minusFactory.create().getResult(a, b);

    System.out.println(c);
    System.out.println(d);
  }
}
