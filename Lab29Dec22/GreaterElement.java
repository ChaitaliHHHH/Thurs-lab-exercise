package Lab29Dec22;
 
	import java.util.Scanner;

	class ElementPair {
		int greatestElement;
		int index;

		public ElementPair(int greatestElement, int index) {
			this.greatestElement = greatestElement;
			this.index = index;
		}
	}

	public class GreaterElement {
		public static ElementPair getGreatestElementAndIndex(int arr[]) {
			int ele = arr[0], index = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > ele) {
					ele = arr[i];
					index = i;
				}
			}
			ElementPair p = new ElementPair(ele, index);
			return p;
		}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The Number of Element of The Array:");
			int n = s.nextInt();

			int arr[] = new int[n];

			System.out.println("Enter The Element of the Array:");
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			ElementPair res = getGreatestElementAndIndex(arr);
			System.out.println("The Greatest Element of the Array is " + res.greatestElement
					+ " and it is present in the index " + res.index);

		}
	}
