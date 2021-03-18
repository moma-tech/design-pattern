package top.momatech.dpdemo.states.ages;

import top.momatech.dpdemo.states.AgeState;
import top.momatech.dpdemo.states.Person;

/**
 * Child Age in Child
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/18/21.
 */
public class Child implements AgeState {

  @Override
  public void myAge(Person person) {
    System.out.println("I am a Child");
    person.setAgeState(this);
  }

  @Override
  public void fallDown() {
    System.out.println("Crying");
  }
}
