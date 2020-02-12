public class TestFarm {
    
   public static void main(String[] args){
       Cow c = new Cow("cow", "moo");
       System.out.println(c.getType() + " goes " + c.getSound());
       Chicken ch = new Chicken("chick", "cheep", "cluck");
       System.out.println(ch.getType() + " goes " + ch.getSound());
       Pig p = new Pig("pig", "oink");
       System.out.println(p.getType() + " goes " + p.getSound());
       Farm f = new Farm();
       f.animalSounds();
    
    
    
    
}
}