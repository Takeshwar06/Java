

// group of related methode with empty bodies
// multiple interface is possible


interface Bicycle{  // 1.can not create object of interface, 2.it has not method bodiess
  final int something=434; // you can create properties in interfaces and access it (ktm.something)
      int speedUp(int increment);
      int breakUp(int decrement);

}
interface Bike{
    void start();
    void stop();
}
class ktm implements Bicycle,Bike{  // multiple implements
    int speed = 7;
    public int  speedUp(int increment){
        speed+=increment;
        return (speed);
    }

    public int breakUp(int decrement){
        speed-=decrement;
        return(speed);
    }
    public void start(){
        System.out.println("Bike will be started");
    }
    public void stop(){
        System.out.println("Bike will be stoped");
    }
}
public class Interface{

    public static void main(String [] args){
        System.out.println("---Interfaces---");

        ktm one=new ktm();
       System.out.println(one.speedUp(3));
       one.start();
       System.out.println(one.breakUp(5));
       one.stop();
    }
}