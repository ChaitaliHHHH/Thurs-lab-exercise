package ss;

public class PrimeNum {

	public static void main(String[] args) {
int num=150;
boolean a=true;		// TODO Auto-generated method stub
for (int i = 2; i <= num / 2; i++) {
	if(num%i==0) {
		a=false;
	}
}

if(a=true) {
System.out.println(num+ "Which number is not prime: ");
}
else {
	System.out.println(num+"Which number is prime");
}

	}}
	


