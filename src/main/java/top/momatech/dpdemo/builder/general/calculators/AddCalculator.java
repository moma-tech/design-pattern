package top.momatech.dpdemo.builder.general.calculators;

import top.momatech.dpdemo.builder.general.Calculator;
import top.momatech.dpdemo.builder.general.CalculatorBuilder;
import top.momatech.dpdemo.builder.general.operations.AddOperation;

/**
 * AddCalculator only do add
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class AddCalculator extends CalculatorBuilder {
  private Calculator calculator = new Calculator();

  @Override
  protected void setName(String name) {
    calculator.setName(name);
  }

  @Override
  protected void setOps() {
    calculator.setOps(new AddOperation());
  }

  @Override
  protected Calculator buildCalculator() {

    return this.calculator;
  }
}
