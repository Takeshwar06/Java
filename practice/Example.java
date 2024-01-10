interface Tiger{
   final int a=12;
   public void show();
}

 class Extiger implements Tiger{
   
   public void show(){
    System.out.println("tiger is going on");
   }

}
public class Example {
    public static void main(String ...after ){
        // System.out.println("helo");
      Extiger E = new Extiger();

      E.show();
      final int a=122;
    


    }
}