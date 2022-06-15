package array;

public class deleteAnElement {
	static int delete(int arr[],int n,int x) {
      
		int i = 0;
		
		for(i=0; i<n; i++) {
			if(arr[i]==x) 
				break;
			}
		if (i==n)
			return n;
		for(int j=i;j>n-1;j++) {
		 
			arr[j+1]= arr[j];
		}
		return n-1;
		}
	public static void main(String[] args) {
	int arr[]= new int [5];
		
		int n=3; int x =20; 
		
	    arr[0] = 5; arr[1] = 10; arr[2] = 20;
		
	    System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	
	       
	       n= (delete(arr,n,x));
	       System.out.println();
	       System.out.println("After deletion");
	      
	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
	

	}

}
