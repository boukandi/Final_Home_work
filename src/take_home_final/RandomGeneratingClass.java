package take_home_final;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomGeneratingClass {
	
	
	public static void main(String[] args) {
		 Random rand = new Random(); 
		 Set <Integer> ts =new TreeSet<Integer>();
		 while(ts.size()<500) {
		 
		    int randomInteger = rand.nextInt((1000 - 5) + 1) + 5;
           ts.add(randomInteger);
		 }
		 System.out.println(ts);
		 System.out.println(ts.size());

		 System.out.println("i've generated 500 random numbers for you");
		 System.out.println("===============");
		 Object[ ]allRandom = ts.toArray();
         System.out.println("which Nth smalest number do you want?");
         Scanner userInput= new Scanner (System.in);
         int N= userInput.nextInt();
         System.out.println(allRandom[N-1]);
         
	}

}
