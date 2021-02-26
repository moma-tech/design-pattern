package top.momatech.dpdemo.observer;

/**
 * Subscriber
 *
 * <p>//TODO
 *
 * @author ivan
 * @version 1.0 Created by ivan at 2/26/21.
 */
public abstract class Subscriber {
  public abstract void updateMessage(String result);

  public abstract void showValue();
}
