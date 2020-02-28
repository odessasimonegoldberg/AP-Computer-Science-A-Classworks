public class SuperMario extends Character{
    
    private String outfit;
    public SuperMario(){
        super();
        outfit = "Overalls";
        
    }
    public SuperMario(String playerN, int x, int y, String outfit){
        super(playerN, x, y); //sends data up into constructor in super class: Character
        this.outfit = outfit;
        
        
        
    }
    
    public void swim(){
        int x = getX() + 1;
        int y = getY() + 1;
        setX(x);
        setY(y);
        
    }
    
    
    //method override
    public String toString(){
        return super.toString() + ". Outfit: " + outfit;
        
        
    }
    
    
    
    
    
    
    
}