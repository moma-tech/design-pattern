package top.momatech.dpdemo.strategy.ops;

import top.momatech.dpdemo.strategy.Operation;

/**
 * AddOperation
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/24/21.
 */
public class AddOperation implements Operation {
  @Override
  public double doCalculate(double a, double b) {
    return a + b;
  }
}
