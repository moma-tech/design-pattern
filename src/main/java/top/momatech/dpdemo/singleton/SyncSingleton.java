package top.momatech.dpdemo.singleton;

/**
 * SyncSingleton
 *
 * <p>double lock
 *
 * <p>only create when needed
 *
 * <p>careful with concurrent, use lock
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/1/21.
 */
public class SyncSingleton implements java.io.Serializable {
  private static final long serialVersionUID = -8686715938339305407L;
  private static volatile SyncSingleton INSTANCE = null;

  private SyncSingleton() {}

  public static SyncSingleton getINSTANCE() {
    if (null == INSTANCE) {
      synchronized (SyncSingleton.class) {
        if (null == INSTANCE) {
          INSTANCE = new SyncSingleton();
        }
      }
    }
    return INSTANCE;
  }

  private Object readResolve() {
    return INSTANCE;
  }

  public void whoAmI() {
    System.out.println("I'm a lazy and double checked one");
  }
}
