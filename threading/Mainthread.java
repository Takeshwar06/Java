
class Mythrad1 extends Thread{
    public void run(){
        int a=0;
      while(a<199){
         System.out.println("chating time");
         a++;
      }
    }
} 

class Mythrad2 extends Thread {
    public void run(){
        int a=0;
       while(a<199){
         System.out.println("cooking time");
         a++;
       }
 }
}
public class Mainthread{
    public static void main(String arg[]){
        System.out.println("--Thread--");
        Mythrad1 t1 =new Mythrad1();
        Mythrad2 t2 =new Mythrad2();
     
    //  t1 and t2 both are run concurrently that means  non blocking nature
        t1.start();
        t2.start();

    }
}