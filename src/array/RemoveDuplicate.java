package array;

public class RemoveDuplicate {
	
	static int RemoveDups(int arr[], int n)
	{
		int res=1;
		
		for(int i=1;i<n;i++) {
			if(arr[res-1]!= arr[i]) 
			{
				arr[res]=arr[i];
				res++;
			}
		}
		
     return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,20,30,30,30,45,45};
		int n=7;
		
		n =RemoveDups(arr,n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
