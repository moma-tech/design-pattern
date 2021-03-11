package top.momatech.dpdemo.factory.general.operations;

import top.momatech.dpdemo.factory.general.Operation;

/**
 * AddOperation Add
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/9.
 */
public class AddOperation implements Operation {

  @Override
  public double getResult(double a, double b) {
    return a + b;
  }
}
