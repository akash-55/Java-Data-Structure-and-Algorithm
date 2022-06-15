package array;

public class SearchArray {

	static  int search (int arr[], int n, int x) {
		for(int i=0; i<n; i++) {
			if(arr[i]== x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {13,20,5,67};
		int x= 67;
		
		System.out.println(search(arr, arr.length, x));

}
}