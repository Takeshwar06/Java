
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {

    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(g.getTimeZone());
        System.out.println(g.isLeapYear(2023));
    }
    
}
