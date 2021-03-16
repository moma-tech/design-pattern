package top.momatech.dpdemo.proxy.staticproxy;

/**
 * AddProxy Add proxy
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/16.
 */
public class AddProxy implements AddOperation {
  private AddImpl add;

  AddProxy(AddImpl add) {
    this.add = add;
  }

  @Override
  public double doAdd(double a, double b) {
    System.out.println("Input Number:" + a + "," + b);

    return add.doAdd(a, b);
  }
}
