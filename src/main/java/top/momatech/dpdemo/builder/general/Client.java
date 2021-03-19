package top.momatech.dpdemo.builder.general;

import top.momatech.dpdemo.builder.general.calculators.AddCalculator;

/**
 * Client
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class Client {
  public static void main(String[] args) {
    Director director = new Director(new AddCalculator());
    Calculator calculator = director.build("Add Op");
    System.out.println(calculator.getOps().doOps(1, 2));
    System.out.println(calculator.getName());
  }
}
