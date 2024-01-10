
import java.util.Scanner;

class switchCase{

    public static void main (String [] args){
        System.out.println("---switch_case---");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){

        int a=sc.nextInt();
          
          switch(a){
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
                default:
                    System.out.println("value not matched");
          }
        }
    }
}