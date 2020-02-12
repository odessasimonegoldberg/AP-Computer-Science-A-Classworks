import java.util.*;
public class RoadRace {
    
    public static void main(String[] args){
 
   ArrayList<String> race = new ArrayList<String>();
    race.add("48 F");
    race.add("52 M");
    race.add("43 F");
    race.add("49 F");
    race.add("50 M");
    race.add("57 M");
    separateHeat(race);
   
}
//break
public static int separateHeat(ArrayList<String> raceData){
ArrayList<Integer> male = new ArrayList<Integer>();
ArrayList<Integer> female = new ArrayList<Integer>();
ArrayList<Integer> combined = new ArrayList<Integer>();
for(int i = 0; i < raceData.size(); i++){
    if(raceData.get(raceData.size() -1).equals("M")){
        String data = raceData.get(raceData.size()-1).substring(0, -1);
        int newData = Integer.valueOf(data);
        male.add(newData);
        
    }
    else{
        String data = raceData.get(raceData.size()-1).substring(0, -1);
        int newData = Integer.valueOf(data);
        female.add(newData);
        
    }
          
}
for(int i = 0; i < raceData.size(); i++){
    
        String data = raceData.get(raceData.size()-1).substring(0, -1);
        int newData = Integer.valueOf(data);
        combined.add(newData);
   }
int overall = combined.get(0).intValue();
for(int i =1; i<combined.size(); i++){
    if(combined.get(i).intValue() > overall){
        overall = combined.get(i);

}
}    

int maxMale = male.get(0).intValue();
for(int i =1; i<male.size(); i++){
    if(male.get(i).intValue() > maxMale){
        maxMale = male.get(i);

}
}

int maxFemale = female.get(0).intValue();
for(int i =1; i<female.size(); i++){
    if(female.get(i).intValue() > maxFemale){
        maxFemale = female.get(i);

}
}
    System.out.println(maxMale);
    System.out.println(maxFemale);
    return "The winner in the male race was " + maxMale + ". The winner in the female race is " + maxFemale + ". The overall winner is " + overall;
}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
