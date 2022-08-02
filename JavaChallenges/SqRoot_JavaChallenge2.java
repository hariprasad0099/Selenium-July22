package javaPractice;

public class SqRoot_JavaChallenge2 {

	public static void main(String[] args) {
		
		//declare the number to find sqrt
		int num = 0;
		
		int x ;
		
		for (int i =0 ; i <= num; ) {
			
			x = i*i;
			
			if(num ==i) {
				System.out.println( " The number '"+num +"' itself the sqrt");
				break;
			}
			
			if (x < num) {
				i++;			
			}
			
			if (x == num) {
				System.out.println("The sq root here is " + i);;
				break;			
			}
			
			if (x > num) {
				System.out.println("The sq root is  " + (i-1));
				break;			
			}
			
		}

		
		

	}

}
