

public class classwork8 {
public static void main(String[] args) {
    System.out.println(raceToday(30, true));
    System.out.println(raceToday(450, false));
    System.out.println(raceToday(700, true));
    System.out.println(raceToday(850, true));
    System.out.println(numValue(10));
    System.out.println(numValue(9));
    System.out.println(numValue(15));
    
   
    
    
    
}
    public static boolean raceToday(int size, boolean isFriday) {
        
       if(isFriday == true){
           if ((size >=150) && (size <= 800)){
               return true;
            }
            else {
                return false;
            }
        }
       else{
               return false;
        }
    }
public static int numValue(int number){
 if(number%2 == 0){
     return 5*number;
    }
 else {
     if(number%5 == 0){
         return number/5;
         
        }
     else {
         return 3*number;
        }
    }
}
        
}

