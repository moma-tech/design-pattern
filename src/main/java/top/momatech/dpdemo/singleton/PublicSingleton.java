package top.momatech.dpdemo.singleton;

/**
 * PublicSingleton
 *
 * <p>Use public field with private constructor
 *
 * <p>Only called once, only one existed
 *
 * <p>For serialization, need to provide readResolve()
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/1/21.
 */
public class PublicSingleton implements java.io.Serializable {
  private static final long serialVersionUID = 4210788679599678647L;
  public static final PublicSingleton INSTANCE = new PublicSingleton();

  private PublicSingleton() {}

  public void whoAmI() {
    System.out.println("I'm a public Field");
  }

  private Object readResolve() {
    return INSTANCE;
  }
}
