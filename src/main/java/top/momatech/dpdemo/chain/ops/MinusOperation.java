package top.momatech.dpdemo.chain.ops;

import top.momatech.dpdemo.chain.Operations;

import java.util.Map;

/**
 * MinusOperation
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/17.
 */
public class MinusOperation extends Operations {
  @Override
  public void doOp(Double base, Map<String, Double> request) {
    if (request.containsKey("minus")) {
      System.out.println("Input value: " + base + ", will do minus");
      base = base + request.get("minus");
      System.out.println("Now Value: " + base);
    }
    if (this.getNextOp() != null) {
      getNextOp().doOp(base, request);
    } else {
      System.out.println("Finished, Result is: " + base);
    }
  }
}
