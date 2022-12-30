package Lab29Dec22;
import java.util.Scanner;
public class Integer{
public static void main(String arg[]) {
	int num, digit;
	int sum = 0;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
	num = sc.nextInt();

	for (int i = num;i>0;i--){

		digit = num % 10;

		sum = sum + digit;

		num = num / 10;
	}

	System.out.println("Sum of digits: " + sum);
}
}