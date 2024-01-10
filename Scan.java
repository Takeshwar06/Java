
import java.util.Scanner;   

class Scan{
    public static void main(String [] args){
        System.out.println("input by user using Scanner class");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println(s.hasNextInt());
        // int a=s.nextInt();
        float a=s.nextFloat();
        System.out.println("Enter a number: ");
        // int b=s.nextInt();
        float b=s.nextFloat();
        // int sum=a+b;
        float sum=a+b;
        System.out.print("The sum of number is: ");
        // System.out.println(sum);

        // String ====>
          
        System.out.println("Enter a string: ");
        // String str=s.next();  // not read string after a space
        String str=s.nextLine(); // able to read all the string
        System.out.println(str);

    }
}