package mathematics;

public class FactorialOfANumber {
	
	public static int factorial(int n) {
		///this will only work for positive numbers
		
		if (n ==0) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(factorial(5));
	} 

}
