public class Writer{
   private boolean published;
   private int wordsDay;
   private String genre;
   private String name;
   public Writer(String name, boolean pub, int words, String gen){
       published = pub;
       wordsDay = words;
       genre = gen;
       this.name = name;
    }
   public void setName(String name){
      this.name = name;
    }
   public void setPub(boolean pub){
       published = pub;
    }
   public void setWords(int words){
       wordsDay = words;
    }
   public void setGenre(String gen){
       genre = gen;
    }
   
   public String getname(){
       return name;
    }
   public boolean getPub(){
       return published;
    }
   public int getWords(){
       return wordsDay;
    }
   public String getGenre(){
       return genre;
    }
    
  
    
   public String toString(){
       return "Author: " + name + ". Published? " + published + ". Words per Day: " + wordsDay + ". Genre: " + genre;
    }
    
    
}