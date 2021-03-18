package top.momatech.dpdemo.states;

/**
 * Person Person Context
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/18/21.
 */
public class Person {
  private AgeState ageState;

  public void setAgeState(AgeState ageState) {
    this.ageState = ageState;
  }

  public AgeState getAgeState() {
    return ageState;
  }
}
