package array;

public class MoveZeroAtEnd {
	
	 public static void swap(int[] A, int a, int b)
	    {
	        int temp = A[a];
	        A[a] = A[b];
	        A[b] = temp;
	    }
	    
	    public static void moveZeroes(int[] nums,int n) {
	        int count=0;
	        
	        for(int i=0;i<n;i++){
	            if(nums[i]!=0){
	                swap(nums, i, count);
	            
	                count++;
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {22,0,6,34,76,0,65};
		int n= nums.length;
		
		moveZeroes(nums,n);
		
		for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); // Print the array
        }
		

	}

}
