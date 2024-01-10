
class Prioritie extends Thread{
    Prioritie(String name){
        super(name);
    }
    public void run(){
      for(int  i=0;i<100;i++){
          System.out.println(this.getName());
      }
    }
}
public class ThreadPriorities{

    public static void main(String arg[]){
      System.out.println("thread priorities");
    //   jvm run thread using Ready Queue: T1,T2,T3,T4
    // it has three types of priorities 
    // 1) Thread.MIN_PRIORITY = 1 
    // 2) Thread.NORM_PRIORITY = 5 
    // 3) Thread.MAX_PRIORITY = 10 
    // we set priorities of thread 

    Prioritie p1 = new Prioritie("tiger1");
    Prioritie p2 = new Prioritie("tiger2");
    Prioritie p3 = new Prioritie("tiger3");
    Prioritie p4 = new Prioritie("tiger4");
    Prioritie p5 = new Prioritie("tiger5");
  
    // setting costom priorities 
    p4.setPriority(Thread.MAX_PRIORITY); // after max priority p4 run more time 
    p1.setPriority(Thread.MIN_PRIORITY);
    p2.setPriority(Thread.NORM_PRIORITY); // it is bydefault existing 
    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    }
}