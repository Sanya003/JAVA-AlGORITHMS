import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/** represents a random word selector */
public class RandomWord{
     /**
      * reads a sequence of words from std input 
      * prints one word uniformly at random
      *
      * @param args sequence of words
      */
      public static void main(String[] args){
        int index=0;
        String champion="";

        while(!StdIn.isEmpty()){
            String word=StdIn.readString();
            boolean accept=StdRandom.bernoulli(1/(index+1.0));
            if(accept){
                champion=word;
            }   
            index++;
        }
        StdOut.println(champion);
     }
    
}
