import java.util.Scanner;
public class Classwork4 {  //class header
    public static void main(String[] args) { //Yellow = method -- method header for main method
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.nextLine();  
        System.out.println("It's nice to meet you " + name + ".");
        
        if (name.equals("Kelly") || name.equals("Ms. Kennedy")){
            System.out.println("You teach this class");
        }
        else {
            System.out.println("You must be a student.");
        
        }
        
        System.out.println("Who are you voting for in this next election?");
        name = scan.nextLine();
        if (name.equals("Trump") || name.equals("President Trump")) {
            System.out.println("You are a Republican");
            
        }
        else {
           System.out.println("You are a Democrat."); 
        }
        name = name.substring(0,2);
        System.out.println(name);
        
   }
}