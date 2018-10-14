
public class Euler3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		long n=600851475143L;
		
		while(n%2==0)
		    n=n/2;
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		    n=n/i;
		
		
		System.out.println(n);
	}
}
