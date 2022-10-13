/**
 * @author Drumstyle92
 * class that contains the program.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method that contains a string, a string method, and an output.
     */
    public static void main(String[] args) {
        // string creation
        String myString = "x3z ? xYz ! R1 && __";
        System.out.println("-------------------------------------------------");
        System.out.println(myString.replaceAll("[a-z0-9]","*"));

    }
}
