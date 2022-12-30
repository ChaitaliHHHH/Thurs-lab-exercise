package Lab29Dec22;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
		String str;  
		Scanner s=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		str=s.nextLine();                    
		System.out.print("After reverse string is: ");  
		for(int i=str.length();i>0;--i)                
		{  
		System.out.print(str.charAt(i-1));            
		}  
		}  
		}
	


