package top.momatech.dpdemo.facade;

import top.momatech.dpdemo.facade.operations.AddOperation;
import top.momatech.dpdemo.facade.operations.MinusOperation;

/**
 * CalculatorFacade Calculator Facade
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/15.
 */
public class CalculatorFacade {
  AddOperation addOperation = null;
  MinusOperation minusOperation = null;

  CalculatorFacade() {
    addOperation = new AddOperation();
    minusOperation = new MinusOperation();
  }

  public double addTwiceMinusOnceAddOnce(double a, double b) {
    System.out.println("do addTwiceMinusOnceAddOnce: " + a + " , " + b);
    double result = 0;
    result = addOperation.add(a, b);
    result = addOperation.add(result, b);
    result = minusOperation.minus(result, b);
    result = addOperation.add(result, b);
    return result;
  }
}
