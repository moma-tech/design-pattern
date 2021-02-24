package top.momatech.dpdemo.strategy;

/**
 * Calculator
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/24/21.
 */
public class Calculator {
  Operation operation;

  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  public void doOperation(double a, double b) {
    System.out.println(operation.doCalculate(a, b));
  }
}
