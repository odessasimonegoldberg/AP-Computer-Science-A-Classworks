public class StringProcessor2 {
    
    public static void main(String[] args){
        /*
        ifPalindrome("racecar");
        */
    }
    
    public static String withoutEnds(String str) 
    {
        return str.substring(1, str.length()-1);
        
        
    }
    
    public static String front2(String str) 
    {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
        
        
        
    }
    public static String firstFour(String str){
        if(str.length() == 3){
        return str + "#";
    }
    else if(str.length() == 2){
        return str + "##";
    }
    else if(str.length() == 1){
        return str + "###";
    }
    else{
        return str.substring(0, 4);
    }
    }
    public static boolean frontAgain(String str){
        if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))){
            return true;
        }
        else {
            return false;
        }
            
    }
    /*
    public static boolean ifPalindrome(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        if (str.substring(i, i+1).equals(str.substring(str.length()-(1 + i)), str.substring(str.length()- i)))
            {
            count += 1;
            System.out.println(str.substring(i));
            System.out.println(str.length()-(1 + i));
        }
        
        }
        if (count >= (str.length()-1)/2){
        return true;
         }
        else {
        return false;
         }
    }
     */   

    
}

        
    
    
    
    
