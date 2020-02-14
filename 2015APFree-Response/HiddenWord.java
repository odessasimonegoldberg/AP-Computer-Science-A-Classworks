
public class HiddenWord{
    private String word;
    
public HiddenWord(String w){
        word = w;
    }
public String getHint(String guess){
        String hint = "";
       boolean tp = false;
       for(int i = 0; i<word.length(); i++){
          if(word.substring(i, i +1).equals(guess.substring(i, i +1))){ 
              hint = hint + word.substring(i, i+1); 
               tp = true;
        }
        for(int j = 0; j<word.length(); j++){
            if(tp == false){
                if(word.substring(i, i +1).equals(guess.substring(j, j +1))){
                    hint = hint + "+";
                    tp = true;
            }
        }
            }
        if(tp == false)
            hint = hint + "*";
    }
    
    return hint;
}
}
    

