package top.momatech.dpdemo.factory.simple;

/**
 * Calculator Calculator
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/9.
 */
public class Calculator {
  public static void main(String[] args) {

    OpFactory opFactory = new OpFactory();
    double a = 1123;
    double b = 222;

    double c = opFactory.getOp("add").getResult(a, b);
    double d = opFactory.getOp("minus").getResult(a, b);

    System.out.println(c);
    System.out.println(d);
  }
}
