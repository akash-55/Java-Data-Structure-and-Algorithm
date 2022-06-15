package mathematics;

public class CountDigit {
      static int countDigit(int x)
    {
    	int res=0;
    	while (x>0) {
    		x=x/10;
    		res++;
    	}
     return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number =35743242;
     System.out.println(countDigit(number));
	}

}
