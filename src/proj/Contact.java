package proj;

/**
 *
 */
public interface Contact {
    // getter/setter for length attr
    int getLength();
    void setLength(int length);

    // getter/setters for speed attr
    int getSpeed();
    void setSpeed(int speed);
    void setSpeed(String speed);

    // getter/setter for name attr
    String getName();
    void setName(String name);

    // getter/setter for type attr
    String getType();
    void setType(String type);

}
