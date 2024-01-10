import java.util.HashSet;

public class SetHash {


    // it has no repeated value it contain unique value
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(1);
        hs.add(5);
        hs.add(5);
        hs.add(5); // repeat value but it is not add multiple time 
        hs.add(2);
        // hs.contains(3);
        // hs.clear();
        // hs.size();
        // hs.addAll(hs);
        System.out.println(hs);// you can print hashSet directly not need to itrate
    }
    
}
