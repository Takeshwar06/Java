

public class Date{

    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);//this is long type stored value
  
        // i store millisecond 1970 to today time in long type variable

        long a= System.currentTimeMillis();
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
    }
}