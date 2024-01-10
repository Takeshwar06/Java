import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateTimeFarmatter {

//   date time farmatter that means farmate your own style
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-->mm-->yyyy");

        // predefine Pattern --> 
        // DateTimeFormatter df= DateTimeFormatter.ISO_DATE_TIME;


        // explore in java doc it is interesting things very importand for project and knoledge
        String ownStyledDate=dt.format(df);
        System.out.println(ownStyledDate);
    }
    
}
