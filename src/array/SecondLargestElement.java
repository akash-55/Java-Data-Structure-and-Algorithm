package array;

public class SecondLargestElement {
	
	static int secondlargestelelement(int arr[]) {
		int res= -1; int largest=0;
		int n= arr.length;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[largest]) 
			{
				res= largest;
				largest= i;
			}
			else if
				(arr[i] != arr[largest])
			{
				  if(res == -1 || arr[i]>arr[res])
					  res=i;
		    }
		}
		
		
		
		return res;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,5,86,68,74,20};
       
		System.out.println(secondlargestelelement(arr));
	}

}
