package top.momatech.dpdemo.decorator;

/**
 * BaseOperator
 *
 * <p>Base Initial
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/25/21.
 */
public class BaseOperator implements Operator {
  @Override
  public Double result() {
    return 0.0;
  }

  @Override
  public void show() {
    System.out.println("Calculator Start");
  }
}
