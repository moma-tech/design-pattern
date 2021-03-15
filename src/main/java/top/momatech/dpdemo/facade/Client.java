package top.momatech.dpdemo.facade;

/**
 * Client
 * Facade Client
 *
 * @author Ivan
 * @version 1.0
 * Created by Ivan at 2021/3/15.
 **/
public class Client {

  public static void main(String[] args) {
    CalculatorFacade calculatorFacade = new CalculatorFacade();
    System.out.println(calculatorFacade.addTwiceMinusOnceAddOnce(123,33));
  }
}