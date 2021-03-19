package top.momatech.dpdemo.builder.beans;

/**
 * Calculator Calculator with builder
 *
 * @author ivan
 * @version 1.0 Created by ivan at 3/19/21.
 */
public class Calculator {
  private String name;
  private double numOne;
  private double numTwo;
  private Operations ops;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getNumOne() {
    return numOne;
  }

  public void setNumOne(double numOne) {
    this.numOne = numOne;
  }

  public double getNumTwo() {
    return numTwo;
  }

  public void setNumTwo(double numTwo) {
    this.numTwo = numTwo;
  }

  public Operations getOps() {
    return ops;
  }

  public void setOps(Operations ops) {
    this.ops = ops;
  }

  /**
   * //Constrctor with Builder
   *
   * @author Created by ivan on 2:33 PM 3/19/21.
   * @param builder : Params
   */
  public Calculator(Builder builder) {
    name = builder.name;
    numOne = builder.numOne;
    numTwo = builder.numTwo;
    ops = builder.ops;
  }

  /**
   * Static Builder
   *
   * @author Created by ivan on 2:36 PM 3/19/21.
   * @return builder class
   */
  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private String name;
    private double numOne;
    private double numTwo;
    private Operations ops;

    public Builder() {}

    /**
     * For Chain purpose
     *
     * @author Created by ivan on 2:37 PM 3/19/21.
     * @return self
     * @param name :
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder numOne(double numOne) {
      this.numOne = numOne;
      return this;
    }

    public Builder numTwo(double numTwo) {
      this.numTwo = numTwo;
      return this;
    }

    public Builder ops(Operations ops) {
      this.ops = ops;
      return this;
    }

    public Calculator build() {
      return new Calculator(this);
    }
  }
}
