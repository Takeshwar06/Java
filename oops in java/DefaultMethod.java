// default method in interface

interface Test{
    void somethig();
    private void somethig2(){ 
           System.out.println("something2");
    }
    default void defaultfunc(){  // no need to implements in class
        System.out.println("defatlfunctin");
    }
}

class Tester implements Test{
  public void somethig(){
        System.out.println("something");
    }
  
}
public class DefaultMethod{

    public static void main(String [] args){

        System.out.println("---default method in interface---");

        Tester t = new Tester();
        
        // t.somethig2(); // can not access because it is private method in interface
    }
}