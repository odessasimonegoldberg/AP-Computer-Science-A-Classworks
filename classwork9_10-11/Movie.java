

public class Movie
{
    
    //instance variables are the adjectives to describe your object
    private String title;
    private String genre;
    private double lengthInMin;
    private boolean haveOscar;
    private String rating;
    
    //constructor definition
    
    public Movie(String titl, String gen, double length){
        title = titl;
        genre = gen;
        lengthInMin = length;
        
        
    }
    
    //mutator method for changing private data
    public void setTitle(String t){
        title = t;
        
    }
    public void setGenre(String g){
        genre = g;
        
    }
    public void setLength(double l){
        lengthInMin = l;
    }
    
    //accessor method to accessing the private data
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public double getLength(){
        return lengthInMin;
    }

}
