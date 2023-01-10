import java.util.Random;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Main{
   public static void main(String[] args) {
    pluralize("dog", 1);
    pluralize("cat", 2);
    pluralize("turtle", 0);
    flipNHeads(2);
    clock();

   }
    public static void pluralize (String word, int count){
        if (count > 1 || count < 1 ) {
            System.out.println("I own " + count + " " + word + "s.");
        }else System.out.println("I own " + count + " " + word + ".");
    }
    
    public static void flipNHeads (int n){
        Random rand = new Random();
        int headsCount = 0;
        int flipCount = 0;
        
       while (headsCount != n){
        float randInt = rand.nextFloat();
        flipCount++;
        if (randInt >= .5 ) {
            System.out.println("heads");
            headsCount++;
            
        } 
        else {headsCount = 0;
        System.out.println("tails");

        }
    }
       System.out.println("It took " + flipCount +  " flips to flip " + n + " heads in a row.");
       }
        
        public static void clock (){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(LocalDateTime.now());
    }

}
