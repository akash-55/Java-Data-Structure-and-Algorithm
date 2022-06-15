package array;

public class insertAnElement {
	
	static int insert(int arr[],int n,int x, int cap, int pos) {
    	if(n == cap)
    		return n;
    	
		int idx= pos-1;
		
		for(int i=n; i>=idx; i--) {
			arr[i+1]= arr[i];
			}
		arr[idx]=x;
		
		return n+1;
	}

	public static void main(String[] args) {
		int arr[]= new int [5];
		
		int n=3; int cap=6; int x =69; int pos=2;
		
	    arr[0] = 5; arr[1] = 10; arr[2] = 20;
		
	    System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	
	       
	       n= (insert(arr,n,x,cap,pos));
	       System.out.println();
	       System.out.println("After Insertion");
	      
	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
	
	}
}
