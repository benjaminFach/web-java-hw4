package com.bfach.proj;

/**
 * A physical craft. The Contact interface provides methods for establishing and retrieving
 * properties of the craft.
 *
 * @author Benjamin Fach
 * @since 2018-09-19
 */
public interface Contact {

  int getLength();

  void setLength(int length);

  int getSpeed();

  void setSpeed(int speed);

  void setSpeed(String speed);

  String getName();

  void setName(String name);

  String getType();

  void setType(String type);

}
