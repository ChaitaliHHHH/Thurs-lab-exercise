package lab0112;
import java.io.IOException;
class Multithreading extends Thread {
	public final static void clearConsole()  {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
	
    public void run()
    {
        try {
            
            while(true)  { 
            System.out.println("Light: RED"); 
            Thread.sleep(3000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Light: GREEN"); 
            Thread.sleep(5000); 
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Light: YELLOW"); 
            Thread.sleep(2000); 
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }
}
 

public class Main {
    public static void main(String[] args)
    {
        
       
            Multithreading obj= new Multithreading();
            obj.start();
        
    }
}
