//Example of Pascal's Triangle 
//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Arrays;
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
//		ArrayList<Integer> origin = new ArrayList<Integer>(1);
//		ArrayList<Integer> newList = new ArrayList<Integer>(1);
//		origin.add(1);
//		newList.add(1);
		System.out.println("Great here is Pascal's Triangle to the " + Nth + "th level");
		scan.close();
		pascal(Nth);
//		pascal(origin, newList, n-1);
		
//		 for (int i=0; i < n; i++){
//	            System.out.println(fib(i));
//	        }
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
	
//	public static ArrayList pascal(ArrayList origin, ArrayList newList, int n){
//		int temp;
//		if(n == 0 ){
//			System.out.println(origin);
//			return origin;
//		}
//		else if(n == 1){
//			System.out.println(origin);
//			origin.add(1);
//			System.out.println(origin);
//			return origin;
//		}
//		else{
//			for(int i = 2; i <= n; i++){
////				if(i == origin.size()){
////					origin.add(1);
////					System.out.println(origin);
////				}
////				else{
//					int origin1 = (int) origin.get(i);
//					int origin2 = (int) origin.get(i + 1);
//					temp = (origin1 + origin2);
//					newList.set(i + 1, temp);
//					System.out.println(newList);
////				}
//			}
//		}
//		return origin;
//	}
}

