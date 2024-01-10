
import java.util.Random;
import java.util.Scanner;
class guessNumber{
    int computer,attemptCount=0;

    guessNumber(){
        Random random=new Random();
        computer=random.nextInt(101);
    }
   public  void playGame(){
        System.out.print("Guess a number: ");
        int userNumber;
        Scanner sc=new Scanner(System.in);
        do{
           userNumber=sc.nextInt();
           if(userNumber>computer){
            System.out.print("Lower number please: ");
            attemptCount++;
           }else if(userNumber<computer){
            System.out.print("Greater number please: ");
            attemptCount++;
           }
        }while(computer!=userNumber);
    }

  public  void getScore(){
    System.out.println("you won in "+attemptCount+" attempt");
  }
}
public class guessTheNumber{

    public static void main(String [] args){
        System.out.println("---guess the number---");
        guessNumber player=new guessNumber();
        player.playGame();
        player.getScore();
    }
}