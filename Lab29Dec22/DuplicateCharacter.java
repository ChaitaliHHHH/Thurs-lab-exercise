package Lab29Dec22;
import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {

		System.out.println(" Pleas Enter a String: ");
		Scanner s = new Scanner(System.in);
		String str = s.next();

		int count;
		char stringArr[] = str.toCharArray();

		System.out.println("These are the duplicate characters in the entered string: ");

		for (int i = 0; i < stringArr.length; i++) {
			count = 1;
			for (int j = i + 1; j < stringArr.length; j++) {
				if (stringArr[i] == stringArr[j] && stringArr[i] != ' ') {
					count++;
					stringArr[j] = '0';
				}
			}

			if (count > 1 && stringArr[i] != '0')
				System.out.println(stringArr[i]);
		}
	}
}
