package array;

public class LargestElement_In_Array {
	static int largestelement(int arr[]) {
		int n = arr.length;
		int res=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>res) 
				res=arr[i];
		}
		return res;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,5,1,34,13,23};
		
		System.out.println(largestelement(arr));

	}

}
