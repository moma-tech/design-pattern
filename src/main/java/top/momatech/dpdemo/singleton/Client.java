package top.momatech.dpdemo.singleton;

/**
 * Client
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/1/21.
 */
public class Client {
  public static void main(String[] args) {
    PublicSingleton.INSTANCE.whoAmI();
    StaticFactorySingleton.getInstance().whoAmI();
    EnumSingleton.INSTANCE.whoAmI();
    SyncSingleton.getINSTANCE().whoAmI();
  }
}
