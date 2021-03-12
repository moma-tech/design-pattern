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
  /* Hook*/
  boolean doCheck = false;
  /**
   * Function
   *
   * @author Created by Ivan at 2021/3/12.
   * @return void
   * @param num1 :
   * @param num2 :
   */
  abstract void setValue(double num1, double num2);

  /**
   * Function
   *
   * @author Created by Ivan at 2021/3/12.
   * @return double
   */
  abstract double getResult();

  /**
   * Function - Hook Related
   *
   * @author Created by Ivan at 2021/3/12.
   * @return void
   * @param num1 :
   * @param num2 :
   */
  abstract boolean checkValid(double num1, double num2);

  /**
   * Template
   *
   * @author Created by Ivan at 2021/3/12.
   * @return void
   * @param num1 :
   * @param num2 :
   */
  public final void calculate(double num1, double num2) {
    if (doCheck) {
      if (!checkValid(num1, num2)) {
        System.out.println("Input Not Valid");
        return;
      }
    }
    setValue(num1, num2);
    System.out.println(getResult());
  }

  public final void setDoCheck() {
    this.doCheck = true;
  }

  public final void setNoCheck() {
    this.doCheck = false;
  }
}
