import java.util.Scanner;
import java.util.Random;
public class task1
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Random random=new Random();
      int minnum=1;
      int maxnum=100;
      int attempts=7;
      int rounds=0;
      int score=0;
      System.out.println("welcome to GAME!");
      while(true)
      {
         int targetnumber=random.nextInt(maxnum-minnum+1)+minnum;
         System.out.println("I selected a number between "+minnum+" and "+maxnum+" guess what it is!");
         for(int a=1;a<=attempts;a++)
         {
            System.out.println("attempt "+a+" : enter your guess:");
            int guess=sc.nextInt();
            if(guess==targetnumber)
            {
               System.out.println("CONGRATULATIONS! your guess is correct ");
               score++;
               break;

            }
            else if(guess< targetnumber)
            {
               System.out.println("low number. Try again!");
            }
            else
             {
                System.out.println("high number. Try again!");
             }
         }
         rounds++;
         System.out.println("do you want to play AGAIN ? (yes/no) = ");
         String playagain=sc.next();
         if(playagain.equals("no"))
         {
            break;
         }
      }
         System.out.println("game over! your final score is: "+score+" out of "+rounds+" rounds.");
         sc.close();
      
   }
}