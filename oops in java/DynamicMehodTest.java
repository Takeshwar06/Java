
class Wifi{
     Wifi(){
        System.out.println(" wifi");
     }

     void wifiOn(){
        System.out.println("wifi on");
     }

     void youtubeOn(){
        System.out.println("youtube on form wifi");
    }
}


class Phone extends Wifi{
    Phone(){
        System.out.println("Phone");
    }
    void wifiOn(){
        System.out.println("wifi on from phone");
    }
   
}
public class DynamicMehodTest {
    public static void main(String ...arg){
      Wifi w = new Phone();
      w.wifiOn();
      w.youtubeOn();

    }
    
}
