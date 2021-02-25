package top.momatech.dpdemo.decorator;

/**
 * MathCalculator
 *
 * <p>Base Math
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/25/21.
 */
public abstract class MathOperation implements Operator {
  protected Operator operator;

  public MathOperation(Operator passedOperator) {
    this.operator = passedOperator;
  }
}
