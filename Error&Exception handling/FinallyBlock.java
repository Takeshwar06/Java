/*
no matter error occured or not finally block definatly run
in the program in any situation its use is cleaning up resources
*/

public class FinallyBlock {

    public static int demoFinallyBlock() {
        int a=343;
        int b=3;  // finally block run for (b=0)
        try {
            int c=a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("run finally block");
        }
        return -1;
    }
    public static void main(String[] args) {
        
        System.out.println("finally block");
        
       System.out.println(demoFinallyBlock());

    }
    
}
