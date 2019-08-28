// Example of MergeSort
// Takes an array of unsorted numbers and sort them
// smallest to largest by use a divide and conquer 

public class mergeSort {
	public static void main (String [] args){
		double [] toSort = new double[] {10, 3, 8, 5, 42, 24, 12, 16};
		System.out.print("Given Array: ");
		printArray(toSort);
		double [] newArray = sort(toSort);
		System.out.print("Sort array is: ");
		printArray(newArray);
	}
	
	//Break the array into halves
	public static double[] sort(double[] toSort){
		int length = toSort.length;
		if (length <= 1){
			return toSort;
		}
		
	    double[] a = new double[length/2];
	    double[] b = new double[length - length/2];
	    
	    for (int i = 0; i < a.length; i++){
	    	a[i] = toSort[i];
	    }
	    for (int i = 0; i < b.length; i++){
	    	b[i] = toSort[i + length/2];
	    }
	    return merge(sort(a), sort(b));
	}
	
	//Take the halves and sort them
	public static double[] merge(double[] a, double[] b){
		double[] c = new double[a.length + b.length];
		int i = 0;
		int j = 0;
		
		for(int k = 0; k < c.length; k++){
			if(i >= a.length){
				c[k] = b[j++];
			}
			else if(j >= b.length){
				c[k] = a[i++];
			}
			else if(a[i] <= b[j]){
				c[k] = a[i++];
			}
			else {
				c[k] = b[j++];
			}
		}
		return c;
	}
	
	static void printArray(double arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}