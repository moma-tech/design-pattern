package top.momatech.dpdemo.observer;

import org.hibernate.validator.internal.util.CollectionHelper;

import java.util.List;

/**
 * Calculator
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public class Calculator implements Publisher {
  List<Subscriber> subscriberList = CollectionHelper.newArrayList();

  @Override
  public void addSubscriber(Subscriber subscriber) {
    this.subscriberList.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
    this.subscriberList.remove(subscriber);
  }

  @Override
  public void publish(String message) {
    for (Subscriber subscriber : subscriberList) {
      subscriber.updateMessage(message);
    }
  }
}
