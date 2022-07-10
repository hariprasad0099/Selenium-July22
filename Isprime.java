package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 99;
boolean isprime = true;
for (int i = 2; i < n; i++) {
	
	if (n%i==0) {
		isprime = false;
		break;
	}
	
}
System.out.println("Is the number prime  :" + isprime);
	
}

}
