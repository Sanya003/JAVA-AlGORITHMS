/** represents a hello and a goodbye printer */
public class HelloGoodbye{
    /**
     * prints greeting and goodbye to the names taken from command-line arguments
     * prints the names for the hello message in same order 
     * prints the names for the goodbye message in reverse order
     * 
     * @param args sequence of names
     */
    public static void main(String[] args){
        System.out.println("Hello" + args[0] + " and " + args[1] + ".");
	    System.out.println("Goodbye" + args[1] + " and " + args[0] + ".");
    }
}
