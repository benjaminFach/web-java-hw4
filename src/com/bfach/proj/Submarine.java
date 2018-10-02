package com.bfach.proj;

/**
 * A ship designed to operate completely underwater and is equipped with torpedos.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public class Submarine extends Ship{

  // default values
  private static final int DEFAULT_NUM_TORPEDOS = 2;

  // minimums
  private static final int MIN_NUM_TORPEDOS = 0;

  // class attributes
  private int numberTorpedos;

  // class constructor
  public Submarine() {
    super();
    this.numberTorpedos = DEFAULT_NUM_TORPEDOS;
  }

  // Getters

  /**
   * Returns the number of torpedos on the submarine
   *
   * @return the number of torpedos on the submarine
   */
  public int getNumberTorpedos() {
    return this.numberTorpedos;
  }

  // Setters

  /**
   * Sets the number of torpedos on the submarine
   *
   * @param numberTorpedos the number of torpedos on the submarine
   */
  public void setNumberTorpedos(final int numberTorpedos) {
    // if provided number of missiles is valid, assign it
    // otherwise leave as-is
    if (numberTorpedos >= MIN_NUM_TORPEDOS) {
      this.numberTorpedos = numberTorpedos;
    } else {
      System.out.println(String.format("Please assign a number of torpedos greater than %d", MIN_NUM_TORPEDOS));
    }
  }

  /**
   * Sets the number of torpedos on the submarine
   *
   * @param numberTorpedos the number of torpedos on the submarine
   */
  public void setNumberTorpedos(final String numberTorpedos) {
    // Try to set the number of torpedos by parsing the int
    // Go to default value on parsing exception
    try {
      setNumberTorpedos(Integer.parseInt(numberTorpedos));
    } catch (NumberFormatException ex) {
      this.numberTorpedos = DEFAULT_NUM_TORPEDOS;
    }
  }

  // string representation

  @Override
  public String toString() {
    return String
        .format("%s\nIt has %d torpedos equipped.", super.toString(), numberTorpedos);
  }
}
