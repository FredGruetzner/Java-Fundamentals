//Example of the Fibonacci sequence using recursion


import java.util.Scanner;

public class FibExample {
	public static void main(String [] args){
		// Get user input
		userInput();
	}
	
	public static void userInput(){
		Scanner scan = new Scanner(System.in);
			System.out.println("This program show the Fibonacci sequence to the Nth positive number \n" +
				"Beware larger number will take longer to calculate");
			System.out.print("Enter the positive Nth number: ");
		// ((!scan.hasNextInt()) || scan.nextInt() < 0)
		while (!scan.hasNextInt()){
			System.out.println("Please enter a positive number: ");
			scan.next();
		}
		int NthNumber = scan.nextInt();
		System.out.println("Great here are the first " + NthNumber + " number(s) of the Fibonacci sequence");
		scan.close();
		//Print out Fibonacci Sequence
		 for (int i=0; i < NthNumber; i++){
	            System.out.println(fibonacci(i));
	        }
	}
	
	//Calculate Fibonacci Sequence
	public static int fibonacci(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
	