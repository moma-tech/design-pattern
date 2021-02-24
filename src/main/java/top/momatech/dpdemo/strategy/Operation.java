package top.momatech.dpdemo.strategy;

/**
 * Operation
 *
 * <p>Operation Interface
 *
 * <p>FYI, use BigDecimal+String for accuracy
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/24/21.
 */
public interface Operation {
  double doCalculate(double a, double b);
}
