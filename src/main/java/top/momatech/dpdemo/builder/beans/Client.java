package top.momatech.dpdemo.builder.beans;

import top.momatech.dpdemo.builder.beans.operations.AddOperation;

/**
 * Client
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class Client {
  public static void main(String[] args) {
    Calculator calculator =
        Calculator.builder().name("add").numOne(1).ops(new AddOperation()).build();
    System.out.println(calculator.getName());
    System.out.println(calculator.getOps().doOps(calculator.getNumOne(), calculator.getNumTwo()));
  }
}
