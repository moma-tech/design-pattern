package top.momatech.dpdemo.singleton;

/**
 * EnumSingleton
 *
 * <p>Same as Public Field without worry about Serializable
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/1/21.
 */
public enum EnumSingleton {
  INSTANCE;

  public void whoAmI() {
    System.out.println("I'm a ENUM class");
  }
}
