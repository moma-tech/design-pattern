package top.momatech.dpdemo.proxy.staticproxy;

/**
 * AddImpl General Add Impl
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class AddImpl implements AddOperation {

  @Override
  public double doAdd(double a, double b) {
    return a + b;
  }
}
