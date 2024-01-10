class A{

     static int a;
     static void geta(){
        System.out.println(a);
     }
    static{
        System.out.println("helo");
    }
     static class Innerclass{
        static int a=50;
     }
     
}
public class StaticKey {
    public static void main(String ...a){
    //   System.out.println(A.a);
    A b = new A();
   System.out.println(A.Innerclass.a);
    }
    
}
