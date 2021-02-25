package top.momatech.dpdemo.decorator;

import top.momatech.dpdemo.decorator.decs.DoubleOperator;
import top.momatech.dpdemo.decorator.decs.StepAddOperator;

/**
 * Client
 *
 * <p>Decoretor Client
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/25/21.
 */
public class Client {
  public static void main(String[] args) {
    // Init
    Operator operator = new BaseOperator();
    // Wrap Step Add to Base
    operator = new StepAddOperator(operator);
    // Wrap Double to Step add
    operator = new DoubleOperator(operator);
    // Call double:show
    operator.show();

    System.out.println(operator.result());
  }
}
