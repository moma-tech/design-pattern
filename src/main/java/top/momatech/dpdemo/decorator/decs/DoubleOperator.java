package top.momatech.dpdemo.decorator.decs;

import top.momatech.dpdemo.decorator.MathOperation;
import top.momatech.dpdemo.decorator.Operator;

/**
 * DoubleOperator
 *
 * <p>Double the given value
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/25/21.
 */
public class DoubleOperator extends MathOperation {
  public DoubleOperator(Operator passedOperator) {
    super(passedOperator);
  }

  @Override
  public Double result() {
    return this.operator.result() * 2;
  }

  @Override
  public void show() {
    operator.show();
    System.out.println("Double the result, and result is " + this.result());
  }
}
