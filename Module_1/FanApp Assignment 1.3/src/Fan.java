/**
 * 1. Four constants named STOPPED, SLOW, MEDIUM, and FAST with values 0, 1, 2, and 3 to represent the fans speed.
 * 2. A private int data field named speed that specifies the speed of the fan. Use the constants and set the default speed to STOPPED.
 * 3. A private boolean data field named on that specifies whether the fan is on or off. The default is off (i.e., false).
 * 4. A private double data field named radius that specifies the radius of the fan. The default is 6.
 * 5. A private string data field named color that specifies the color of the fan. The default is white.
 * 6. Accessor and mutator methods for all four data fields.
 * 7. A no-argument constructor that creates a default fan (set all fields to their default values).
 * 8. An argument constructor that creates a fan using the four fields as arguments.
 * 9. Override the toString method. Return a string description for the fan. If the fan is on, the
 * method returns the fan speed, color, and radius in a combined string. If the fan is not on,
 * the method returns the fan color, radius, and a message of “fan is off” in a combined
 * string.
 */

public class Fan {
    //Our constant values that represent Fan Speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //DataFields of Fan Class
    private int speed;
    private boolean isFanOn;
    private double radius;
    private String color;


    //Constructor which stores default values
    public Fan() {
        speed = STOPPED;
        isFanOn = false;
        radius = 6.0;
        color = "White";
    }

    public Fan(int speed, boolean isFanOn, double radius, String color) {
        this.speed = speed;
        this.isFanOn = isFanOn;
        this.radius = radius;
        this.color = color;
    }

    //Getters & Setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method used to return String data of Fan
    @Override
    public String toString() {
        if (isFanOn) { // Checking Whether Fan is on/off
            return "The fan speed is set to "
                    + this.getSpeed() + " with a colour of "
                    + this.getColor() + " and a radius of "
                    + this.getRadius();
        } else {
            return "The fan is "
                    + this.getColor() + " with a radius of "
                    + this.getRadius() + " and the fan is off";
        }
    }
}
