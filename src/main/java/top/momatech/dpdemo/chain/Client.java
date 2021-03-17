package top.momatech.dpdemo.chain;

import top.momatech.dpdemo.chain.ops.AddOperation;
import top.momatech.dpdemo.chain.ops.MinusOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * Client
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/17.
 */
public class Client {
  public static void main(String[] args) {
    // Defined Chain
    Operations first = new AddOperation();
    Operations second = new MinusOperation();
    first.setNextOp(second);
    // Usage
    Double base = 1.0;
    Map<String, Double> ops = new HashMap<>();
    ops.put("add", 4.0);
    ops.put("minus", 2.0);
    first.doOp(base, ops);
  }
}
