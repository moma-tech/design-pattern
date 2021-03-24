package top.momatech.dpdemo.flyweight.shapes;

import top.momatech.dpdemo.flyweight.Color;
import top.momatech.dpdemo.flyweight.IShape;

/**
 * BarShape Bar shape
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/24.
 */
public class BarShape implements IShape {
  private int length;
  private Color color;

  /**
   * Create with Common Property
   *
   * @author Created by Ivan at 2021/3/24.
   * @param color :
   */
  public BarShape(Color color) {
    this.color = color;
  }

  @Override
  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public int getLength() {
    return length;
  }
}
