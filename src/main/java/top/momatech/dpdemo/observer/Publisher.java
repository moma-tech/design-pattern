package top.momatech.dpdemo.observer;

/**
 * Publisher
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public interface Publisher {
  void addSubscriber(Subscriber subscriber);

  void removeSubscriber(Subscriber subscriber);

  void publish(String message);
}
