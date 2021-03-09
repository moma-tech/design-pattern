package top.momatech.dpdemo.observer.obs;

import top.momatech.dpdemo.observer.Subscriber;

/**
 * AddSubscriber
 *
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public class AddSubscriber extends Subscriber {
  private Double addResult = 0.0;

  @Override
  public void updateMessage(String result) {
    Double value = Double.valueOf(result);
    this.addResult = addResult + value;
  }

  @Override
  public void showValue() {
    System.out.println("The Add Result = " + addResult);
  }
}
