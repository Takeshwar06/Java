
// handle exception specifically 
public class SpecificException{

    public static void main(String arg[]){
         System.out.println("specific Exception");
         int arr[] = new int [5];
         arr[0]=100;
         arr[1]=200;
         arr[2]=300;
         arr[3]=400;
         arr[4]=500;
         System.out.println("Enter index");
         java.util.Scanner sc=new java.util.Scanner(System.in);
         int index=sc.nextInt();
         System.out.println("Enter number");
         int number=sc.nextInt();

         try{
           System.out.println("arr["+index+"] = "+arr[index]);
           System.out.println("arr[index]/number="+arr[index]/number);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
         }
         catch(ArithmeticException e){
            System.out.println("ArithmeticException");
         }
         catch(Exception e){
            System.out.println(e);
         }
    }
}