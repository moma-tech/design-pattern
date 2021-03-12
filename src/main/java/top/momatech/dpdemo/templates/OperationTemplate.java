package top.momatech.dpdemo.templates;

/**
 * OperationTemplate operation template
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/12.
 */
public abstract class OperationTemplate {
  double a;
  double b;

  abstract void setValue(double num1, double num2);

  abstract double getResult();

  public final void calculate(double num1, double num2) {
    setValue(num1, num2);
    System.out.println(getResult());
  }
}
