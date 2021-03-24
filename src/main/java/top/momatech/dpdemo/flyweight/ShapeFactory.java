package top.momatech.dpdemo.flyweight;

import top.momatech.dpdemo.flyweight.shapes.BarShape;

import java.util.HashMap;

/**
 * ShapeFactory Shape Factory
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/24.
 */
public class ShapeFactory {
  /** Pool */
  private HashMap<String, BarShape> shapeHashMap = new HashMap<>(16);

  /**
   * Create BarShape base on Color
   *
   * @author Created by Ivan at 2021/3/24.
   * @return top.momatech.dpdemo.flyweight.shapes.BarShape
   * @param color :
   */
  public BarShape getBarShape(String color) {
    if (shapeHashMap.containsKey(color)) {
      return shapeHashMap.get(color);
    } else {
      Color color1 = new Color(color);
      BarShape barShape = new BarShape(color1);
      shapeHashMap.put(color, barShape);
      return barShape;
    }
  }
}
