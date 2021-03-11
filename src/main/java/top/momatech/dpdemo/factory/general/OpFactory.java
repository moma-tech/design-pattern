package top.momatech.dpdemo.factory.general;

import top.momatech.dpdemo.factory.general.operations.AddOperation;
import top.momatech.dpdemo.factory.general.operations.MinusOperation;

/**
 * OpFactory General Factory
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/11.
 */
public class OpFactory {
  public static Operation add() {
    return new AddOperation();
  }

  public static Operation minus() {
    return new MinusOperation();
  }
}
