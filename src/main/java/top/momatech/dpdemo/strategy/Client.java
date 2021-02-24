package top.momatech.dpdemo.strategy;

import top.momatech.dpdemo.strategy.ops.AddOperation;
import top.momatech.dpdemo.strategy.ops.MinusOperation;

/**
 * Client
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0
 * Created by ivan at 2/24/21.
 **/
public class Client {
  public static void main(String[] args) {
    //
      double a = 100;
      double b = 50;
      Calculator calculator = new Calculator();
      calculator.setOperation(new AddOperation());
      calculator.doOperation(a,b);
      calculator.setOperation(new MinusOperation());
      calculator.doOperation(a,b);
  }
}