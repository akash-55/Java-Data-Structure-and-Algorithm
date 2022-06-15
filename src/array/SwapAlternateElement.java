package array;

public class SwapAlternateElement {
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	static void swap(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length-1;i+=2) {
			if((i+1)<arr.length) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		printArray(arr);
		
		
	}
	

	public static void main(String[] args) {
		int arr[]= {6,3,65,8,34};
		System.out.println("before swapping");
		printArray(arr);
		System.out.println();
		System.out.println("After swapping");
        swap(arr);
       
	}

}
