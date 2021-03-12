package top.momatech.dpdemo.templates;

/**
 * MinusOperation Minus Operation
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/12.
 */
public class MinusOperation extends OperationTemplate {
  public MinusOperation() {
    /*HOOK*/
    super.setDoCheck();
  }

  @Override
  void setValue(double num1, double num2) {
    a = num1;
    b = num2;
  }

  @Override
  double getResult() {
    return a - b;
  }

  @Override
  boolean checkValid(double num1, double num2) {
    return num1 > num2;
  }
}
