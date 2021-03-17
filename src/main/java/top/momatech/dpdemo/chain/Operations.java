package top.momatech.dpdemo.chain;

import java.util.Map;

/**
 * Operations
 *
 * <p>Define Abstract Operations
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/17.
 */
public abstract class Operations {

  private Operations nextOp;

  /**
   * Set Next Handler
   *
   * @author Created by Ivan at 2021/3/17.
   * @param op : operations
   */
  protected void setNextOp(Operations op) {
    this.nextOp = op;
  }

  /**
   * Get
   *
   * @author Created by Ivan at 2021/3/17.
   * @return top.momatech.dpdemo.chain.Operations
   */
  protected Operations getNextOp() {
    return nextOp;
  }

  /**
   * Every Handler on the chain should do this
   *
   * @author Created by Ivan at 2021/3/17.
   * @param base : input
   * @param request : commands
   */
  public abstract void doOp(Double base, Map<String, Double> request);
}
