public class Wannabe extends Writer {
    private int timeWasted;
    private int booksUnfinished;
    
    public Wannabe(String name, boolean pub, int words, String gen, int timeWasted, int booksUnfinished){
         super(name, pub, words, gen);
         this.timeWasted = timeWasted;
         this.booksUnfinished = booksUnfinished;
       
    
        }
    public void setTime(int time){
        timeWasted = time;
    }
    public void setBooksUnfinished(int booksU){
        booksUnfinished = booksU;
    }
    
    public int getTime(){
        return timeWasted;
    }
    public int booksUnfinished(){
        return booksUnfinished;
    }
    
    public void scrollTumblr(){
        timeWasted += 120;
    }
    public void scrollTwitter(){
        timeWasted += 120;
    }
    public void postAmWriting(){
        timeWasted += 10;
    }
    public void procrastinate(){
        postAmWriting();
        scrollTumblr();
        scrollTwitter();
    }
    
    
    public void startNewNovel(){
        booksUnfinished += 1;
    }
    
    public void readABookSimilartoYourOwn(){
        booksUnfinished += 1;
    }
    
    public String toString(){
      return super.toString() + ". Time Wasted: " + timeWasted + ". Books Left Unfinished: " + booksUnfinished;  
        
    }
    
}