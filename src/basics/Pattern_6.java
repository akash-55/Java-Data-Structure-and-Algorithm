// 1
// 12
// 123
// 1234
// 12345
// 123456
package basics;

public class Pattern_6 {

	public static void main(String[] args) {
		int n= 6;
		
		for(int i=1; i<=n; i++) {
			for(int j=1 ; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
