package top.momatech.dpdemo.templates;

/**
 * Client Client
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/12.
 */
public class Client {
  public static void main(String[] args) {
    OperationTemplate operation = new AddOperation();
    operation.calculate(123, 456);
    operation = new MinusOperation();
    operation.calculate(456, 123);
  }
}
