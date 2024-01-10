import java.util.Calendar;
import java.util.TimeZone;

// Calendar is a abstruct class and  it is give a instance
public class CalendarClass {
    
    public static void main(String[] args) {
      Calendar c= Calendar.getInstance(); // local
      // Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // specific
      System.out.println(c.getCalendarType());
      System.out.println(c.getTimeZone().getID());
      System.out.println(c.getTime());

      System.out.println(c.get(Calendar.DATE));
      System.out.println((c.get(Calendar.HOUR)<=9?"0"+c.get(Calendar.HOUR):c.get(Calendar.HOUR))+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

      System.out.println(c.get(Calendar.HOUR)<=9?"0"+c.get(Calendar.HOUR):c.get(Calendar.HOUR));

    }
}
