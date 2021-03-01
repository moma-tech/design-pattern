package top.momatech.dpdemo.singleton;

/**
 * StaticFactorySingleton
 *
 * <p>Private filed with private constructor
 *
 * <p>Public Method to return INSTANCE
 *
 * <p>For serialization, need to provide readResolve()
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/1/21.
 */
public class StaticFactorySingleton {
  private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

  private StaticFactorySingleton() {}

  public void whoAmI() {
    System.out.println("I'm a private Field with a Call Method");
  }

  private Object readResolve() {
    return INSTANCE;
  }

  public static StaticFactorySingleton getInstance() {
    return INSTANCE;
  }
}
