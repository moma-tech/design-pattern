package top.momatech.dpdemo.factory.abstractfactory.factory;

import top.momatech.dpdemo.factory.abstractfactory.OpFactory;
import top.momatech.dpdemo.factory.abstractfactory.Operation;
import top.momatech.dpdemo.factory.abstractfactory.operations.MinusOperation;

/**
 * MinusFacroty MInus Factory
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/11.
 */
public class MinusFactory implements OpFactory {

  @Override
  public Operation create() {
    return new MinusOperation();
  }
}
