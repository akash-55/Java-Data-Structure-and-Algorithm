package bitwise_Program;

public class Count_Set_Bit {
	
	static void countSetbit(int x) {
		int res=0;
		
		while(x!= 0) {
			x=(x&(x-1));
				res++;
		 }
		System.out.print(res);
		}

	public static void main(String[] args) {
          countSetbit(-11);
	}

}
