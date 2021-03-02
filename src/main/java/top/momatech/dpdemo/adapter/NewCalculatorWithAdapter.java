package top.momatech.dpdemo.adapter;

/**
 * NewCalculatorWithAdapter
 *
 * <p>adapter for old calculator to match new requirement
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/2/21.
 */
public class NewCalculatorWithAdapter extends MyOldCalculator implements NewCalculator {
  /* add operation will use old calculator */
  /**
   * new Minus
   *
   * @author Created by ivan on 4:40 PM 3/2/21.
   * @param a : input a
   * @param b : input b
   * @return double result
   */
  @Override
  public double minus(double a, double b) {
    return a - b;
  }

  @Override
  public double multi(double a, double b) {
    return a * b;
  }

  @Override
  public double power(double a, double b) {
    return Math.pow(a, b);
  }
}
