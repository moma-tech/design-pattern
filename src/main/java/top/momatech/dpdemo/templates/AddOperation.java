package top.momatech.dpdemo.templates;

/**
 * AddOperation Add operation
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/12.
 */
public class AddOperation extends OperationTemplate {
  @Override
  void setValue(double num1, double num2) {
    a = num1;
    b = num2;
  }

  @Override
  double getResult() {
    return a + b;
  }
}
