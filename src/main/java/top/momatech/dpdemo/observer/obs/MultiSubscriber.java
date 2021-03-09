package top.momatech.dpdemo.observer.obs;

import top.momatech.dpdemo.observer.Subscriber;

/**
 * MultiSubscriber
 *
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public class MultiSubscriber extends Subscriber {
  private Double multiResult = 1.0;

  @Override
  public void updateMessage(String result) {
    Double value = Double.valueOf(result);
    this.multiResult = multiResult * value;
  }

  @Override
  public void showValue() {
    System.out.println("The Multi Result = " + multiResult);
  }
}
