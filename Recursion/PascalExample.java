// Example of Pascal's Triangle 
// Originally was going to use recursion to solve the triagnle
// found that solving line by line was an easier code read 
// This code is not efficient for high levels of the triagnle 
// Java math combinations formula from
// https://stackoverflow.com/questions/2201113/combinatoric-n-choose-r-in-java-math
import java.util.Scanner;

public class PascalExample {
	public static void main(String [] args){
		// Get user input
		userInput();
	}
	
	public static void userInput(){
		Scanner scan = new Scanner(System.in);
			System.out.println("This program show Pascal's Triangle to the Nth positive number \n" +
				"Beware larger number will take longer to calculate");
			System.out.print("Enter the positive Nth number: ");
		// ((!scan.hasNextInt()) || scan.nextInt() < 0)
		while (!scan.hasNextInt()){
			System.out.println("Please enter a positive number: ");
			scan.next();
		}
		int Nth = scan.nextInt();
		System.out.println("Great here is Pascal's Triangle to the " + Nth + "th level");
		scan.close();
		pascal(Nth);
	}
	
	public static void pascal(int Nth){
		for (int i = 0; i < Nth; i++) {
	        int nCk = 1;
	        for (int j = 0; j <= i; j++) {
	            System.out.print(nCk + " ");
	            nCk = nCk * (i-j) / (j+1);
	        }
	        System.out.println();
	    }
	}
}

