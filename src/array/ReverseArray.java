package array;

public class ReverseArray {
	
	    static void reverse(int arr[], int n)
	    {
	    	int low = 0, high = n - 1;

	    	while(low < high)
	    	{
	    		int temp = arr[low];

	    		arr[low] = arr[high];

	    		arr[high] = temp;

	    		low++;
	    		high--;
	    	}
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int arr[] = {90, 55, 34, 8, 45}, n = 5;

	       System.out.println("Before Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       reverse(arr, n);

	       System.out.println("After Reverse");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	}

}
