

class Base{
      int baseValue;
      Base(){
        System.out.println("Base no arg ");
      }

      Base(int a,int b){
        System.out.println("Base 2 arg "+a+" "+b);
      }

}
class Derived extends Base{
     int derivedValue;
     Derived(){
          System.out.println("Derived no arg ");
     }

     Derived(int x,int y){
        super(x,y);
           System.out.println("Derived 2 arg ");
     }
}
public class inheritance{
    
    public static void  main(String [] args){
        System.out.println("---inheritance----");

        Derived d=new Derived(2,2);
        d.baseValue=5;
    }
}