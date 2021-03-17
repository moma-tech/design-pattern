package top.momatech.dpdemo.chain.ops;

import top.momatech.dpdemo.chain.Operations;

import java.util.Map;

/**
 * AddOperations
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/17.
 */
public class AddOperation extends Operations {

  @Override
  public void doOp(Double base, Map<String, Double> request) {
    /* Check if has add command */
    if (request.containsKey("add")) {
      System.out.println("Input value: " + base + ", will do add");
      base = base + request.get("add");
      System.out.println("Now Value: " + base);
    }
    /* Pass to Next */
    if (this.getNextOp() != null) {
      getNextOp().doOp(base, request);
    } else {
      System.out.println("Finished, Result is: " + base);
    }
  }
}
