
public class Fibonacci {

	public static void main(String[] args) {
		int n =10;
		int k =1;
		int m =0;
		System.out.println("first");
		System.out.print(m +" , "+k);
		int temp = 0;
		while(n>2) { 
			temp = k+m;
			System.out.print(", "+temp);
			m = k;
			k = temp;
			
			n--;
		}
		System.out.println();
		System.out.println("second");
		n = 10;
		k = 1; m= 0; temp = 0;
		System.out.print(m+" , "+k);
		for(int i=2;i<n;i++) {
			temp = k+m;
			System.out.print(", "+temp);
			m = k;
			k = temp;
		}
      
		System.out.println();
		System.out.println("Recursion");
		
		System.out.println(n1+", "+n2);
		fibanacci(10);
		
	}
	static int n1=0,n2=1,n3=0;
	private static void fibanacci(int count) {
		
		    if(count>2) {
		    	n3 = n1+n2;
		    	n1=n2;
		    	n2=n3;
		    	System.out.println(n3);
		    	fibanacci(count-1);
		    }
	}

}
