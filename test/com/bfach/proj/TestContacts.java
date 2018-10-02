package com.bfach.proj;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests for the behavior of various types of Contacts against specification.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public class TestContacts {

  // constants
  private static final int NUM_DESTROYERS = 2;
  private static final int NUM_SUBMARINES = 2;
  private static final int NUM_P3s = 2;
  private static final int FIRST_SHIP_INDEX = 0;
  private static final int NEGATIVE_INT_FOR_TESTING = -4;
  private static final int LENGTH_FACTOR = 20;
  private static final int SPEED_FACTOR = 7;
  private static final int MISSILES_FACTOR = 5;
  private static final int TORPEDOS_FACTOR = 2;
  private static final int ENGINES_FACTOR = 1;
  private static final int ALTITUDE_FACTOR = 10000;
  private static final int P3_SPEED_FACTOR = 125;

  // collections
  private List<Destroyer> destroyers = new ArrayList();
  private List<Submarine> submarines = new ArrayList();
  private List<Ship> ships = new ArrayList();
  private List<Contact> contacts = new ArrayList();

  /**
   * Creates destroyers and adds them to relevant collections
   */
  private void createDestroyers() {
    for (int i = 0; i <= NUM_DESTROYERS; i++) {
      // create the destroyer
      Destroyer destroyer = new Destroyer();
      destroyer.setLength(LENGTH_FACTOR * (i + 1));
      destroyer.setSpeed(SPEED_FACTOR * (i + 1));
      destroyer.setName(String.format("Destroyer Number %d", (i + 1)));
      destroyer.setType("Above water");
      destroyer.setNumberMissiles(MISSILES_FACTOR * (i + 1));

      // add destroyer to destroyer, ship, and contact collections
      destroyers.add(destroyer);
      ships.add(destroyer);
      contacts.add(destroyer);
    }
  }

  /**
   * Creates submarines and adds them to relevant collections
   */
  private void createSubmarines() {
    for (int i = 0; i <= NUM_SUBMARINES; i++) {
      // create the submarine
      Submarine sub = new Submarine();
      sub.setLength(LENGTH_FACTOR * (i + 1));
      sub.setSpeed(SPEED_FACTOR * (i + 1));
      sub.setName(String.format("Submarine Number %d", (i + 1)));
      sub.setType("Below water");
      sub.setNumberTorpedos(TORPEDOS_FACTOR * (i + 1));

      // add submarine to submarine, ship, and contact collections
      submarines.add(sub);
      ships.add(sub);
      contacts.add(sub);
    }
  }

  /**
   * Creates P3s and adds them to relevant collections
   */
  private void createP3s() {
    for (int i = 0; i <= NUM_P3s; i++) {
      // create the P3
      P3 p3 = new P3();
      p3.setLength(LENGTH_FACTOR * (i + 1));
      p3.setSpeed(P3_SPEED_FACTOR * (i + 1));
      p3.setName(String.format("P3 Number %d", (i + 1)));
      p3.setType("Recon");
      p3.setNumberEngines(ENGINES_FACTOR * (i + 1));
      p3.setAltitude(ALTITUDE_FACTOR * (i + 1));

      // add p3 to contact collection
      contacts.add(p3);
    }
  }

  /**
   * Runs edge case of supplying string for magnitude
   */
  private void testEdgeCase() {
    Submarine sub = new Submarine();
    sub.setNumberTorpedos("Foo");
    System.out.println(
        "Tried to set sub torpedo count to Foo, but is actually: " + sub.getNumberTorpedos());
  }

  public static void main(String[] args) {
    TestContacts tester = new TestContacts();
    // create destroyers
    tester.createDestroyers();

    // create submarines
    tester.createSubmarines();

    // create P3s
    tester.createP3s();

    // print out the Contact collection
    System.out.println("-------------\n-           -\n- Contacts  -\n-           -\n-------------");
    for (Contact contact : tester.contacts) {
      System.out.println(String.format("%s\n", contact.toString()));
    }

    // test an edge case (as requested in spec)
    System.out.println("-------------\n-           -\n- Edge case -\n-           -\n-------------");
    tester.testEdgeCase();

    // test negative magnitude edge cases
    tester.ships.get(FIRST_SHIP_INDEX).setLength(NEGATIVE_INT_FOR_TESTING);
    tester.ships.get(FIRST_SHIP_INDEX).setSpeed(NEGATIVE_INT_FOR_TESTING);

  }

}
