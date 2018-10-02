package com.bfach.proj;

/**
 * A machine with the ability to fly in the air.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public abstract class Aircraft implements Contact {

  // default values
  private static final int DEFAULT_ALTITUDE = 0;
  private static final int DEFAULT_LENGTH = 30;
  private static final int DEFAULT_SPEED = 0;
  private static final String DEFAULT_NAME = "Generic aircraft name";
  private static final String DEFAULT_TYPE = "Commercial";

  // minimums
  private static final int MIN_ALTITUDE = 0;
  private static final int MIN_LENGTH = 1;
  private static final int MIN_SPEED = 0;

  // class attributes
  private int altitude;
  private int length;
  private int speed;
  private String name;
  private String type;

  // class constructor
  public Aircraft() {
    this.altitude = DEFAULT_ALTITUDE;
    this.length = DEFAULT_LENGTH;
    this.speed = DEFAULT_SPEED;
    this.name = DEFAULT_NAME;
    this.type = DEFAULT_TYPE;
  }

  // Getters

  /**
   * Returns the length of the aircraft.
   *
   * @return the aircraft's length
   */
  public int getLength() {
    return this.length;
  }

  /**
   * Returns the speed of the aircraft.
   *
   * @return the aircraft's speed
   */
  public int getSpeed() {
    return this.speed;
  }

  /**
   * Returns the altitude of the aircraft.
   *
   * @return the aircraft's altitude
   */
  public int getAltitude() {
    return this.altitude;
  }

  /**
   * Returns the name of the aircraft.
   *
   * @return the aircraft's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the type of aircraft.
   *
   * @return the aircraft's type
   */
  public String getType() {
    return this.type;
  }

  // Setters

  /**
   * Sets the length of the aircraft
   *
   * @param length the length of the aircraft
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
   * Sets the speed of the aircraft
   *
   * @param speed the speed of the aircraft
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
   * Sets the speed of the aircraft
   *
   * @param speed the speed of the aircraft
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
   * Sets the altitude of the aircraft
   *
   * @param altitude the altitude of the aircraft
   */
  public void setAltitude(final int altitude) {
    // if provided altitude is valid, assign it
    // otherwise leave it as-is
    if (altitude >= MIN_ALTITUDE) {
      this.altitude = altitude;
    } else {
      System.out.println(String.format("Please assign an altitude of greater than %d", MIN_ALTITUDE));
    }
  }

  /**
   * Sets the name of the aircraft
   *
   * @param name the name of the aircraft
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Sets the type of the aircraft
   *
   * @param type the type of aircraft
   */
  public void setType(final String type) {
    this.type = type;
  }

  // string representation

  @Override
  public String toString() {
    return String
        .format("%s is a %s aircraft at %d feet in length.\nIt is going %d mph at an altitude of %d.", name, type, length,
            speed, altitude);
  }
}
