package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, n=11;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < n; i++) {			
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			

		}
		
	}
}


