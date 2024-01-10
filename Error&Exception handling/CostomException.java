import java.util.Scanner;

// we can throw our comstom exception using throw key word
class MyException extends Exception{
    MyException(String str){
        super(str);  // constructor set message
    }
    @Override
    public String toString() {
        
        return super.toString();  // 
    }

       
}
public class CostomException{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a<18){
         try {
            throw new MyException("age less then 18"); // costom exception 
            // throw new ArithmeticException("age less then 18"); // inbuild exception
         } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            e.printStackTrace();// it is called at the end of the program it give line number which has occured error
            System.out.println(e.getMessage());
         }
        }

    }
}