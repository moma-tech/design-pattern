package top.momatech.dpdemo.builder.beans.operations;

import top.momatech.dpdemo.builder.beans.Operations;

/**
 * AddOperation add
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class AddOperation implements Operations {
  @Override
  public double doOps(double a, double b) {
    return a + b;
  }
}
