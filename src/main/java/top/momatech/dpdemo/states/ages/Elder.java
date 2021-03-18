package top.momatech.dpdemo.states.ages;

import top.momatech.dpdemo.states.AgeState;
import top.momatech.dpdemo.states.Person;

/**
 * Older Old Age
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/18/21.
 */
public class Elder implements AgeState {
  @Override
  public void myAge(Person person) {
    person.setAgeState(this);
    System.out.println("I am an Elder man");
  }

  @Override
  public void fallDown() {
    System.out.println("I need a Ambulance");
  }
}
