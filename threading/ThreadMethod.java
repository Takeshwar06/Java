
class MythrA extends Thread{
    MythrA(String name){
        super(name);
    }

    public void run(){
      for(int i=0;i<88;i++){
          System.out.println(this.getName());
      }
    }
}
public class ThreadMethod{

    public static void main(String arg[]){
        System.out.println("Thread method");
        MythrA mA = new MythrA("tigerA");
        MythrA mB = new MythrA("tigerB");

        mA.start(); 
        try{
            mA.join();  // after this method first complete mA then run mB in thread
        }
        catch(Exception e){
            System.out.println(e);
        }
        mB.start();
        // you can  go oracle.com for more method
    }
}