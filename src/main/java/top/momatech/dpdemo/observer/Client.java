package top.momatech.dpdemo.observer;

import top.momatech.dpdemo.observer.obs.AddSubscriber;
import top.momatech.dpdemo.observer.obs.MultiSubscriber;

/**
 * Client
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public class Client {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.addSubscriber(new AddSubscriber());
    calculator.addSubscriber(new MultiSubscriber());

    for (int i = 0; i < 5; i++) {
      calculator.publish("1.0");
    }
    for (Subscriber subscriber : calculator.subscriberList) {
      subscriber.showValue();
    }
  }
}
