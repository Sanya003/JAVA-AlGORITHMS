/* ****************************************************************************
 * name: Sanya Ahmed
 * date: March 21, 2024
******************************************************************************* */

/** represents a greeting and a goodbye printer */
public class HelloGoodbye{
    /**
     * prints greeting and goodbye to the 2 names
     * 
     * @param args sequence of names
     */
    public static void main(String[] args){
        System.out.println("Hello" + args[0] + " and " + args[1] + ".");
	    System.out.println("Goodbye" + args[1] + " and " + args[0] + ".");
    }
}
