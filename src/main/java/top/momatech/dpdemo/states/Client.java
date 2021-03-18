package top.momatech.dpdemo.states;

import top.momatech.dpdemo.states.ages.Adult;
import top.momatech.dpdemo.states.ages.Child;
import top.momatech.dpdemo.states.ages.Elder;

/**
 * Client State Client
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/18/21.
 */
public class Client {
  public static void main(String[] args) {
    Person person = new Person();

    Child child = new Child();
    child.myAge(person);
    child.fallDown();

    Adult adult = new Adult();
    adult.myAge(person);
    adult.fallDown();

    Elder elder = new Elder();
    elder.myAge(person);
    elder.fallDown();
  }
}
