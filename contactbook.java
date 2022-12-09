package Lab812;


import java.util.*;


class ContactBook
{
	String Name,EmailID;
	String Contactnumber;
	
	ContactBook(String Name,String EmailID,String Contactnumber)
	{
	    this.Name=Name;
	    this.EmailID=EmailID;
	    this.Contactnumber=Contactnumber;
	}
	
	
}
  class Main
{
	
  public static void main(String args[])
  
  {
	  
	  Scanner sc=new Scanner(System.in);
	  int X=0;
	  int I;
	  
	  System.out.println("How many Contactnumber you want to add in your contact list: ");
	   I=sc.nextInt();
	   sc.nextLine();
	   HashSet<ContactBook> arrList=new HashSet<>();
	  while(X<I) 
	  {
	       
	    System.out.println(" Please Enter Name ");
	    String Name=sc.nextLine();
	    System.out.println(" Please Enter Contatnumber ");
	    String Contactnumber= sc.nextLine();
	    System.out.println(" Please Enter EmailID ");
	    String EmailID=sc.nextLine();
	   
	  
    
    
    ContactBook obj=new ContactBook(Name,Contactnumber,EmailID);
    arrList.add(obj);
    X++;
	     
    
}

  for(ContactBook ob:arrList)
  {
      ContactBook temp=ob;
      System.out.println("Name :"+temp.Name+"  "+" Contact Number : "+temp.Contactnumber+"  "+" Email Id: "+temp.EmailID);
  }
  }
  }