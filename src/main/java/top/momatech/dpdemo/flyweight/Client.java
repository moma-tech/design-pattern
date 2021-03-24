package top.momatech.dpdemo.flyweight;

import top.momatech.dpdemo.flyweight.shapes.BarShape;

/**
 * Client
 * Flyweight client
 *
 * @author Ivan
 * @version 1.0
 * Created by Ivan at 2021/3/24.
 **/
public class Client {
  public static void main(String[] args) {
    ShapeFactory shapeFactory  = new ShapeFactory();
    IShape bar1 = shapeFactory.getBarShape("red");
    bar1.setLength(123);
    IShape bar2 = shapeFactory.getBarShape("red");
    bar2.setLength(31);
    System.out.println(bar1.getLength());
    System.out.println(bar2.getLength());
  }
}