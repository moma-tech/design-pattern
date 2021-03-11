package top.momatech.dpdemo.factory.general;

/**
 * Calculator Calculator
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/11.
 */
public class Calculator {
  public static void main(String[] args) {

    double a = 1123;
    double b = 222;

    double c = OpFactory.add().getResult(a, b);
    double d = OpFactory.minus().getResult(a, b);

    System.out.println(c);
    System.out.println(d);
  }
}
