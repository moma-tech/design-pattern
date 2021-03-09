package top.momatech.dpdemo.factory.simple;

import top.momatech.dpdemo.factory.simple.operations.AddOperation;
import top.momatech.dpdemo.factory.simple.operations.MinusOperation;

/**
 * OpFactory Operation Facroty
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/9.
 */
public class OpFactory {
  public Operation getOp(String op) {
    Operation operation = null;
    switch (op) {
      case "add":
        operation = new AddOperation();
        break;
      case "minus":
        operation = new MinusOperation();
        break;
      default:
        operation = new AddOperation();
    }
    return operation;
  }
}
