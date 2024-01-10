class Myrunnable1 implements Runnable{
    public void run(){
       for(int i=0;i<144;i++){
         System.out.println("chating time");
       }
    }
}
class Myrunnable2 implements Runnable{
    public void run(){
      for(int i=0;i<122;i++){
                System.out.println("cooking time");
      }
      }
}

public class Runnableinterface{

    public static void main(String arg[]){
        System.out.println("--runnable interface--");
        Myrunnable1 bullet1 = new Myrunnable1();
        Thread gun1 = new Thread(bullet1);
        Myrunnable2 bullet2 = new Myrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}