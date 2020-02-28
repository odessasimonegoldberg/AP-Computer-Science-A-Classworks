/**
 * @author Odessa Goldberg
 * @version 2.28.20
**/
public class Character{
    private int x;
    private int y;
    private String playerName;
    public Character(){
        //Defaulting where the character will start
        x = 10;
        y = 150;
        playerName = "Odessa";
        
    }
    
    public Character(String name, int x, int y){
        this.x = x;
        this.y = y;
        playerName = name;
    }
    //Mutator Methods
    public void setName(String name){
        playerName = name;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    //Accessor Methods
    public String getName(){
        return playerName;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
      
    
    public String toString(){
        return "Player Name: " + playerName + ". Position: " + x + "," + y;
    }
}