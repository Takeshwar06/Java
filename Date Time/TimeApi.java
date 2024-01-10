import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeApi {
    
    public static void main(String[] args) {
        
       System.out.println(LocalDate.now());
       System.out.println(LocalTime.now());
       System.out.println(LocalDateTime.now());

       LocalDateTime.now().getMinute();
       LocalDateTime.now().getMonth();
       LocalDateTime.now().getDayOfMonth();
       LocalDateTime.now().getDayOfWeek();
       LocalDateTime.now().getMinute();
       // and expolre it for more methods
    }
}
