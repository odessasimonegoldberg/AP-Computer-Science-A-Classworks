import java.util.Scanner;
public class classwork7
{
    public static void main(String[] args){
        System.out.println(findSum(2,3));
        System.out.println(canIvote(16));
        System.out.println(favColor("Blue"));
        System.out.println("What's the temperature (degrees)?");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        System.out.println(weather(temp));
    }
    
    public static double findSum(int a, int b){
        return a +b;
    }
    
    public static String canIvote(int age) {
        if (age >= 18) 
            return "You can vote!";
       
        else 
           return "You can't vote!"; 
        /*don't need curly brackets if it's only one line below if/then clause*/
        
    }
    
    public static String favColor(String color) {
        return color + " is my favorite color too!";
    }
    
    public static String weather(int degree){
        if (degree >= 75){
            return "It's hot out!";
        }
        else if((degree >= 68) && (degree <=74)){
            return "It's perfect weather!";
        }
        else{
            return "It's cold!";
        }
           
    }
    
 
}