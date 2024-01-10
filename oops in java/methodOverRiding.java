

class base{
     public void overRiding(){
          System.out.println("base class");
     }
}
class derived extends base{
    
   public void overRiding(){
          System.out.println("derived class");
     }
}
public class methodOverRiding{

    public static void main(String [] args){
        System.out.println("---method over riding---");
        derived d=new derived();
        d.overRiding();
    }
}