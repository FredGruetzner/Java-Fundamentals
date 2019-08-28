// Example of BubbleSort
// Takes an array of unsorted numbers and sort them
// smallest to largest 

public class bubbleSort {
	public static void main(String[] arg){
		int arr[] = {12,2,4,6,8,10};
		bubbleSort obj = new bubbleSort();
		obj.bSort(arr);
	}
	public static void bSort(int[] arr){
		int n =arr.length;
		int temp = 0;
		for(int i = 0; i < n; i++){
			for(int j = 1; j < (n-i); j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int x: arr){
			System.out.print(x + " ");
		}
	}
}