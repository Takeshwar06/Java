

// exception is two types 
// 1) checked exception  -> it is handling by compiler in compile time
// 2) unchecked exception  -> it is ignored by compiler in compile time compiler send this exception to jvm

// folloing are some exception -->

// 1) Null pointer exception
// 2) ArithmeticException 
// you can go in webside for more exception

public class ExceptionHandle{
    public static void main(String arg[]){
        System.out.println("exception handling ");
        int a=2334;
        int b=0;
        try{
            float c=a/b; // this line throu error because can not 233/0;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

