
import java.util.Scanner;
import java.util.Random;

public class randomNumber{

    public static void main(String [] args){
        int n=0;
        do{
          
          Random random=new Random();
          int number=random.nextInt(3);
          System.out.println("your randomo number is: "+number);

          
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter greater number to stop it generation else enber 0: ");
            n=sc.nextInt();
        }while(n==0);
    }
}