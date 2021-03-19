package top.momatech.dpdemo.builder.general;

/**
 * CalculatorBuilder Builder
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public abstract class CalculatorBuilder {
  protected abstract void setName(String name);

  protected abstract void setOps();

  protected abstract Calculator buildCalculator();
}
