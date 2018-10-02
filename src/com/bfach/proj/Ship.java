package com.bfach.proj;

/**
 * A large vessel meant for seafaring. It's not a boat!
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public abstract class Ship implements Contact {

  // default values
  private static final int DEFAULT_LENGTH = 15;
  private static final int DEFAULT_SPEED = 0;
  private static final String DEFAULT_NAME = "Generic ship name";
  private static final String DEFAULT_TYPE = "Motorized";

  // minimums
  private static final int MIN_LENGTH = 1;
  private static final int MIN_SPEED = 0;

  // attributes
  private int length;
  private int speed;
  private String name;
  private String type;

  // class constructor
  public Ship() {
    this.length = DEFAULT_LENGTH;
    this.speed = DEFAULT_SPEED;
    this.name = DEFAULT_NAME;
    this.type = DEFAULT_TYPE;
  }

  // Getters

  /**
   * Returns the length of the ship in feet
   *
   * @return the ship's length in feet
   */
  public int getLength() {
    return this.length;
  }

  /**
   * Returns the speed of the ship in knots
   *
   * @return the ship's speed in knots
   */
  public int getSpeed() {
    return this.speed;
  }

  /**
   * Returns the name of the ship
   *
   * @return the ship's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the type of ship
   *
   * @return the ship's type
   */
  public String getType() {
    return this.type;
  }

  // Setters

  /**
   * Sets the length of the ship in feet
   *
   * @param length the length of the ship in feet
   */
  public void setLength(final int length) {
    // if provided length is valid, assign it
    // otherwise leave it as-is
    if (length >= MIN_LENGTH) {
      this.length = length;
    } else {
      System.out.println(String.format("Please assign a length of greater than %d", MIN_LENGTH));
    }
  }

  /**
   * Sets the speed of the ship in knots
   *
   * @param speed the speed of the ship in knots
   */
  public void setSpeed(final String speed) {
    // Try to set the speed by parsing the int
    // Go to default value on parsing exception
    try {
      setSpeed(Integer.parseInt(speed));
    } catch (NumberFormatException ex) {
      this.speed = DEFAULT_SPEED;
    }
  }

  /**
   * Sets the speed of the ship in knots
   *
   * @param speed the speed of the ship in knots
   */
  public void setSpeed(final int speed) {
    // if provided speed is valid, assign it
    // otherwise leave it as-is
    if (speed >= MIN_SPEED) {
      this.speed = speed;
    } else {
      System.out.println(String.format("Please assign a speed of greater than %d", MIN_SPEED));
    }
  }

  /**
   * Sets the name of the ship
   *
   * @param name the name of the ship
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Sets the type of the ship
   *
   * @param type the type of the ship
   */
  public void setType(final String type) {
    this.type = type;
  }

  // string representation

  @Override
  public String toString() {
    return String
        .format("%s is a %s ship at %d feet in length.\nIt is going %d knots.", name, type, length,
            speed);
  }
}
