// inheritence between interfaces

interface monkey{
    void eat();
}

interface human extends monkey{  // inherite monkey
    void sleep();
}

class lovish implements human{
    public void sleep(){
        System.out.println("lavish is sleeping mode ");
    }
    public    void eat(){
        System.out.println("lavish is eating something");
    }
}
public class InheritenceInterface{

    public static void main(String args[]){

       lovish man =new lovish();
       man.sleep();
       man.eat();
    }
}