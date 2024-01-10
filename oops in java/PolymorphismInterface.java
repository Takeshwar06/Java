// polymorphism --> single things is existing in multiple form

// 2 types of polymorphism 
// compile time--> static--> funciton overloading --> run(),run(int stpeed),run(int speed,int string name); 
// run time  --> dynamic --> dynamicMehod dispatch --> in run time deside which method will call 


interface Wifi{
   final int like =9; // it can  not be change in main funciton 
    void useWifi();
 
}

interface Gps{
    void useGps();
   
}

interface MusicePlayer{
    void useMusicPlayer();
   
}

class SmartPhone implements Wifi,Gps,MusicePlayer{
        public void useWifi(){
        System.out.println("use wifi");
        }
        public void useGps(){
        System.out.println("use gps");
        }
        public void useMusicPlayer(){
         System.out.println("use musicPlayer");
        }

        public void additionalFunctionality(){
            System.out.println("additionalFunctionality");
        }
}
public class PolymorphismInterface{

    public static void main(String [] args){
        System.out.println("---polymorphism in interface---");

        Wifi w=new SmartPhone();
        w.useWifi();
        // w.useMusicPlayer(); // you can not access because it has reference only wifi

        Gps g= new SmartPhone();
        g.useGps();
        // g.useWifi() ;  // you can not access because it has reference only gps

        MusicePlayer m =new SmartPhone();
        m.useMusicPlayer();
        // m.additionalFunctionality(); // also yo can not access becausse it is method of smartphone class
        // m.useGps();  // you can not access because it has reference only Musicplayer
      
      
    }
}