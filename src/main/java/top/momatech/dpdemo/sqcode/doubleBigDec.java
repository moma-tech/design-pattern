package top.momatech.dpdemo.sqcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * doubleBigDec
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/5/7.
 */
public class doubleBigDec {
  public static void main(String[] args) {
    /*double a = 0.00000000000000000000000001;
    BigDecimal b = BigDecimal.valueOf(a); // 正确用法
    BigDecimal c = new BigDecimal(a); // 精度问题
    // 1.0E-26
    System.out.println(b.toString());
    // 0.000000000000000000000000010
    System.out.println(b.toPlainString());
    // 1.000000000000000038494869749191839081371989361591338301396127643500357819184021224145908490754663944244384765625E-26
    System.out.println(c.toString());
    // 0.00000000000000000000000001000000000000000038494869749191839081371989361591338301396127643500357819184021224145908490754663944244384765625
    System.out.println(c.toPlainString());
    long d = 12L;
    System.out.println(Double.longBitsToDouble(d));
    Optional<String> op = Optional.empty();
    if(null== op){
      System.out.println("is null");
    }
    if(!op.isPresent()){
      System.out.println("is empty");
    }*/

    List<Integer> a = new ArrayList();
    a.add(3);
    a.add(2);
    a.add(1);
    a = a.stream().sorted().collect(Collectors.toList());
    for (Integer b : a) {
      System.out.println(b);
    }
    double ddd = new Double(0.0).longValue();

  }
}
