
public class Stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hello World";
        int value= name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring= name.toUpperCase();
        System.out.println(ustring);

        String nontrimstring="     Hello World    ";
        System.out.println(nontrimstring);

        String trimedstring=nontrimstring.trim();
        System.out.println(trimedstring);


        System.out.println(name.substring(1,4));
        System.out.println(name.replace("e","r"));

    }

	}


