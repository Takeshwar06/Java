

class phone{
    phone(){
        System.out.println("phone constructor");
    }
      public void phoneMethod(){
        System.out.println("phoneMethod");
      }
    //   public void screen(){
    //      System.out.println("screen phone");
    //   }
}
class smartPhone extends phone{
     public void smartPhoneMethod(){
        System.out.println("smartPhoneMethod");
     }
   
     public void screen(){
         System.out.println("screen smartPhone");
      }

smartPhone(){
        System.out.println("smartPhone constructor");
    }
}
public class dynamicMethodDispathc{

    public static void main(String [] args){
        System.out.println("---dynamic method dispatch---");

       phone obj = new smartPhone();

    //    obj.phoneMethod();
    obj.screen();
    }
}