package proj;

import javax.annotation.Nu

public abstract class Ship implements Contact {
    private int length;
    private int speed;
    private String name;
    private String type;

    /** Getters **/

    /**
     * Returns the length of the ship.
     * @return the ship's length
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Return the speed of the ship.
     * @return the ship's speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Return the name of the ship.
     * @return the ship's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the type of ship.
     * @return the ship's type
     */
    public String getType() {
        return this.type;
    }

    /** Setters **/

    public void setLength(@Nullable int length) {
        this.length = length;
    }
}
