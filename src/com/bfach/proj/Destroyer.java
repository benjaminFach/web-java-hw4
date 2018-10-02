package com.bfach.proj;

/**
 * A ship that is small, fast, and built for warfare. Equipped with missiles.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public class Destroyer extends Ship {

  // default values
  private static final int DEFAULT_NUM_MISSILES = 2;

  // minimums
  private static final int MIN_NUM_MISSILES = 0;

  // class attributes
  private int numberMissiles;

  // class constructor
  public Destroyer() {
    super();
    this.numberMissiles = DEFAULT_NUM_MISSILES;
  }

  // Getters

  /**
   * Returns the number of missiles on the destroyer
   *
   * @return the number of missiles on the destroyer
   */
  public int getNumberMissiles() {
    return this.numberMissiles;
  }

  // Setters

  /**
   * Sets the number of missiles on the destroyer
   *
   * @param numberMissiles the number of missiles on the destroyer
   */
  public void setNumberMissiles(final int numberMissiles) {
    // if provided number of missiles is valid, assign it
    // otherwise leave as-is
    if (numberMissiles >= MIN_NUM_MISSILES) {
      this.numberMissiles = numberMissiles;
    } else {
      System.out.println(
          String.format("Please assign a number of missiles greater than %d", MIN_NUM_MISSILES));
    }
  }

  /**
   * Sets the number of missiles on the destroyer
   *
   * @param numberMissiles the number of missiles on the destroyer
   */
  public void setNumberMissiles(final String numberMissiles) {
    // Try to set the number of missiles by parsing the int
    // Go to default value on parsing exception
    try {
      setNumberMissiles(Integer.parseInt(numberMissiles));
    } catch (NumberFormatException ex) {
      this.numberMissiles = DEFAULT_NUM_MISSILES;
    }
  }

  // string representation

  @Override
  public String toString() {
    return String
        .format("%s\nIt has %d missiles equipped.", super.toString(), numberMissiles);
  }

}
