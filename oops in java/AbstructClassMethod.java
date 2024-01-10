

// any thing exist in only thought is called abstruct

// without implementation (only decleare method ) is called abstruct method 

// if any class has atlist one abstruct method is called abstruct class

// can not make object of abstract class

abstract class SmartPhone{ 
    // it is work as reference for derived class 
    
    abstract public void switchOff();
    abstract public void switchOn();
    abstract public void playMusic();

    public void clock(){
        System.out.println("clock function is not abstract function so it is accesseble withot overriding");
    }
}

class Realme extends SmartPhone{
     @Override    
     public void switchOff(){
        System.out.println("Realme switchOff");
     }
     public void switchOn(){
       System.out.println("Realme switchOn");
     }
     public void playMusic(){
       System.out.println("Realme playMusic");

     }
}
class Redmi extends SmartPhone{
     @Override    
     public void switchOff(){
        System.out.println("Redmi switchOff");
     }
     public void switchOn(){
       System.out.println("Redmi switchOn");
     }
     public void playMusic(){
       System.out.println("Redmi playMusic");

     }
}
public class AbstructClassMethod{
   
   public static void main(String [] args){
    System.out.println("---abastruct class and method---");
         Realme r= new Realme();
         Redmi r1=new Redmi();
         r.switchOff();
         r.switchOn();
         r.playMusic();

         r1.switchOff();
         r1.switchOn();
         r1.playMusic();

   }
}

