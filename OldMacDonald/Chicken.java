import java.util.*;
public class Chicken implements Animal {
    private String myType;
    private String mySound;
    private String mySound1;
    Chicken(String type, String sound){
        myType = type;
        mySound = sound;
    }
    Chicken(String type, String sn1, String sn2){
        myType = type;
        mySound = sn1;
        mySound1 = sn2;
        
    }
    public String getSound(){
        int ran = (int)(Math.random() * 2);
        if(ran == 1){
            return mySound;
        }
        else{
            return mySound1;
        }
    }
    public String getType(){
        return myType;
    }
    
}