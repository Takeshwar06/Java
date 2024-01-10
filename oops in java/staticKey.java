// static --> belongs to the class ,

// the static can be --> variable,method,block, nexted class

// static variable common propertry of all object of a class,initial value = 0
// static variable getst memore only one in the class area at the time of calss loading

// any static member can be accessed before any object of it class are created\

class CountObj{
    public static int count=0;
    CountObj(){
        count++;
        // System.out.println(count);
    }
}

public class staticKey{
    public static void main(String [] args){
      CountObj a = new CountObj();
      CountObj b = new CountObj();
      CountObj c = new CountObj();
      System.out.println(a.count);
      System.out.println(b.count);
    }
}