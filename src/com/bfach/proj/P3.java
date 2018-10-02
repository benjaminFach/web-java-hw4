package com.bfach.proj;

/**
 * An aircraft built with a variable amount of engines, handy for surveillance.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public class P3 extends Aircraft {

  // default values
  private static final int DEFAULT_NUM_ENGINES = 1;

  // minimums
  private static final int MIN_NUM_ENGINES = 1;

  // class attributes
  private int numberEngines;

  // class constructor
  public P3() {
    super();
    this.numberEngines = DEFAULT_NUM_ENGINES;
  }

  // Getters

  /**
   * Returns the number of engines on the P3
   * @return the number of engines
   */
  public int getNumberEngines() {
    return this.numberEngines;
  }

  // Setters

  /**
   * Sets the number of engines on the P3
   * @param numberEngines the number of engines
   */
  public void setNumberEngines(final int numberEngines) {
    // if provided engine count is valid, assign it
    // otherwise leave it as-is
    if (numberEngines >= MIN_NUM_ENGINES) {
      this.numberEngines = numberEngines;
    } else {
      System.out.println(String.format("Please assign a number of engines  greater than %d", MIN_NUM_ENGINES));
    }
  }

  @Override
  public String toString() {
    return String
        .format("%s\nIt has %d engines.", super.toString(), numberEngines);
  }
}
