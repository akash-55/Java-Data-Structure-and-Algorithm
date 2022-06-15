package mathematics;

public class PrimeNumber {
   static boolean isPrime(int n) {
	   if (n==0 || n==1) {
		   return false;
	   }
	   else {
		   for(int i=2;i*i<=n;i++) {
			   if(n%i  ==0) {
				   return false;
			   }
		   }
		 return true;
	   }
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number =7;
     System.out.println(isPrime(number));
	}
}
