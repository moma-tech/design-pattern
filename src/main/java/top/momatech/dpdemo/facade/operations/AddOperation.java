package top.momatech.dpdemo.facade.operations;

/**
 * AddOperation Add two value
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/15.
 */
public class AddOperation {

  public double add(double a, double b) {
    System.out.println("do Add: "+a+" , "+b);
    return a + b;
  }
}
