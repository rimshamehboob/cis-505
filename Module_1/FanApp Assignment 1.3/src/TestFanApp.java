/**
 * 10. Create a new file named TestFanApp with a main() method to test the Fan class. Create
 * two instances of the Fan class, one using the default constructor and the other using the
 * argument constructor. For the second argument constructor, use the classes constants to
 * set the speed. Display the objects by invoking the classes toString() method.
 */
public class TestFanApp {
    public static void main(String[] args) {
        Fan fanUsingDefaultConstructor = new Fan();
        System.out.println(fanUsingDefaultConstructor);

        Fan fanUsingParameterizedConstructor = new Fan(Fan.SLOW, true, 3.4, "Green");
        System.out.println(fanUsingParameterizedConstructor);
    }
}