package top.momatech.dpdemo.strategy.ops;

import top.momatech.dpdemo.strategy.Operation;

/**
 * MinusOperation
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/24/21.
 */
public class MinusOperation implements Operation {

  @Override
  public double doCalculate(double a, double b) {
    return a - b;
  }
}
