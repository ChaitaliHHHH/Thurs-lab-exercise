package Lab812;

import java.util.*;
class Students{
    String Studentid,StudentName,StudentAddress ,StudentEmail,StudentContact;
    
    public Students(String Studentid,String StudentName,String StudentAddress,String StudentEmail,String StudentContact)
    {
        this.Studentid=Studentid;
        
        this.StudentName=StudentName;
        
        this.StudentAddress=StudentAddress;
        
        this.StudentEmail=StudentEmail;
        
        this.StudentContact=StudentContact;
    }
    
}
     class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Students>ar=new ArrayList<>();
		HashSet<String>Id=new HashSet<>(); 
		System.out.println("Enter The Number of Entry");
		int Y=sc.nextInt();
		sc.nextLine();
		
		int i=0;
		while(i<Y)
		{
		    	System.out.println("Please Enter The Student Id:");
		    	String id=sc.nextLine();
		    	System.out.println("Please Enter The Name of the Student:");
		    	String Name=sc.nextLine();
		    	System.out.println("Please Enter the Address of the Student");
		    	String Address=sc.nextLine();
		    	System.out.println(" Please Enter The Email Number:");
		    	String Email=sc.nextLine();
		    	System.out.println("Please Enter The Contact Number");
		    	String Contact=sc.nextLine();
		    	
		    	if(Id.contains(id))
		    	{
		    	    System.out.println("Id Already Exist Please Try Another");
		    	    i--;
		    	}
		    	else{
		    	    Id.add(id);
		    	    Students obj=new Students(id,Name,Address,Email,Contact);
		    	    ar.add(obj);
		    	    
		    	}
		    	
		    	
		    	
		    	
		    	i++;
		    	
		}
	
	System.out.println(" Please Enter The Id of The Student:");
	String studentid=sc.nextLine();
	
	for(Students s:ar)
	{
	    Students temp=s;
	    if(temp.Studentid.equals(studentid))
	    {
	        System.out.println("Student id: "+temp.Studentid+"  "+"Name: "+temp.StudentName+"  "+"Address: "+temp.StudentAddress+"   "+"Email:  "+temp.StudentEmail+"  "+"Contact Number: "+temp.StudentContact);
	    }
	}
}
}