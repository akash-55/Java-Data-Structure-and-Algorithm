package bitwise_Program;

public class Power_Of_Two {
	
	static boolean powOf2(int n) {
		if(n==0) { 
			return false;}
		else {
			return ((n & (n-1))==0);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.print(powOf2(4));

	}

}
