package top.momatech.dpdemo.proxy.dynamic;

/**
 * MinusImpl MInus
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class MinusImpl implements MinusOperation {
  @Override
  public double doMinus(double a, double b) {
    return a - b;
  }
}
