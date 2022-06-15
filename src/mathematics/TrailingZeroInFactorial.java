package mathematics;

public class TrailingZeroInFactorial {
	public static int trailZero(int n) {
		int res= 0;
		for(int i=5;i <= n;i= i*5) {
			res= res + n/i;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		System.out.println(trailZero(251));

	}

}
