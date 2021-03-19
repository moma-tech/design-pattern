package top.momatech.dpdemo.builder.general;

/**
 * Director Builder Director
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class Director {
  private CalculatorBuilder builder = null;

  public Director(CalculatorBuilder builder) {
    this.builder = builder;
  }

  public Calculator build(String name) {
    builder.setName(name);
    builder.setOps();
    return builder.buildCalculator();
  }
}
