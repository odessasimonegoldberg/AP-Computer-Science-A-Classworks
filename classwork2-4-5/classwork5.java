
import java.util.Random;
import java.util.Scanner;
public class classwork5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        for(int i = 0; i < 10; i+= 1)
         {   
            double randNum = Math.random();
            System.out.println(randNum);
            For math.random method: you can get 0, but never 1.
            double randNum1 = Math.random()* 101;
            System.out.println((int)randNum1);
            
            double dice = Math.random() * 7;
            System.out.println("Your program just rolled a " + (int)dice + ".");
            
          
            
            
        }
        */
        /*
        boolean game = false;
        while(game == false){
            System.out.println("Do you want to make a wager on this roll?");
            String wage = scan.nextLine();
            if(wage.equals("yes") || wage.equals("Yes")) {
            double dice1 = Math.random() * 6 + 1;
            double dice2 = Math.random() * 6 + 1;
            int sum = (int)dice1 + (int)dice2;
                if(sum == 7 || sum == 11) {
                    System.out.println("You rolled a sum of"+ sum + ".");
                    game = true;
                    System.out.println("You won!");
            
        
        
                }
                else if(sum == 2 || sum == 3 || sum == 12){
                    System.out.println("You rolled a sum of "+ sum + ".");
                    game = true;
                    System.out.println("You lost!");
            
                }
                else {
                    System.out.println("You rolled a sum of " + sum);
                    System.out.println("Keep Playing!");
                }
            
          }
          else {
              game = false;
              
            }
           */
          /*
          System.out.println("Ask me a question");
          String question = scan.nextLine();
          System.out.println(question);
          double response = Math.random() * 7 + 1;
          response = (int)response;
          if(response == 1) 
          {
              System.out.println("The answer is right in front of you.");
            }
          else if(response ==  2)
          {
              System.out.println("It's too soon to tell.");
            }
          else if(response == 3)
          {
              System.out.println("It's best if you don't know the answer to that.");
            }
            
          else if(response == 4)
          {
              System.out.println("Most definitely.");
            }
            
          else if(response == 5)
          {
              System.out.println("The odds are in your favor");
            }
          else if(response == 6)
          {
              System.out.println("It is too soon to tell");
            }
          else if(response == 7)
          {
              System.out.println("It is very likely.");
            }
          */
           /*
          System.out.println("How many sides would you like your dice to have?");
          int sides = scan.nextInt();
          if(sides <= 0){
              System.out.println("Invalid entry");
              
            }
          else {
              double roll = Math.random() * (sides -1) + 1;
              System.out.println("Your program just rolled a " + (int)roll);
            }
          */
          
          double num = Math.random() * 99;
          num = (int)num;
          int guess = -2;
          System.out.println("You get 10 tries to get the right number between 0-100.");
          boolean game1 = false;
          
          for(int i = 0; i <10; i++){
         
              System.out.println("What's your guess?");
              guess = scan.nextInt();
              if(guess > num)
              {
                  System.out.println("Try lower");
                }
              else if(guess < num)
              {
                  System.out.println("Try higher");
                }
              else if(num == guess)
              {
                  System.out.println("Game over! You won!");
                  break;
                }
           }
          if(guess != num){
              System.out.println("You lost. The number was " + num);
            }
           System.out.println(num);
        }
        
    }
       
        
   
    

