package top.momatech.dpdemo.factory.abstractfactory.factory;

import top.momatech.dpdemo.factory.abstractfactory.OpFactory;
import top.momatech.dpdemo.factory.abstractfactory.Operation;
import top.momatech.dpdemo.factory.abstractfactory.operations.AddOperation;

/**
 * AddFactory
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/3/11.
 */
public class AddFactory implements OpFactory {
  @Override
  public Operation create() {
    return new AddOperation();
  }
}
