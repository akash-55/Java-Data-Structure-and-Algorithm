package bitwise_Program;

public class Kth_bit_check {
	public static void bitcheck(int x,int k) {
		if((x & (1<<(k-1))) !=0) {
			System.out.print("Set");
		}else {
			System.out.print("Not set");
		}
	}

	public static void main(String[] args) {
		bitcheck(5,1);
		

	}

}
