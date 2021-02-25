package top.momatech.dpdemo.decorator.decs;

import top.momatech.dpdemo.decorator.MathOperation;
import top.momatech.dpdemo.decorator.Operator;

/**
 * AddCalculate
 *
 * <p>Add 1.0
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/25/21.
 */
public class StepAddOperator extends MathOperation {

  public StepAddOperator(Operator passedOperator) {
    super(passedOperator);
  }

  @Override
  public Double result() {
    return this.operator.result() + 1.0;
  }

  @Override
  public void show() {
    operator.show();
    System.out.println("Step Add 1.0, and result is " + this.result());
  }
}
