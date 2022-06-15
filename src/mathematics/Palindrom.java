package mathematics;

public class Palindrom {
	public static boolean isPal (int n) {
		int rev =0;
		int temp=n;
		while(temp!=0 ) {
			int ld = temp%10;
			rev =rev*10+ ld;
			temp= temp/10;
		}
		return(rev==n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isPal(878));
	}
}
