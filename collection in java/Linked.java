import java.util.LinkedList;

public class Linked {
    
    public static void main(String ...arg) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> li2= new LinkedList<>();

        li2.add(11);
        li2.add(11);
        li2.add(11);

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        li.addAll(0, li2);

        // li.set(0, null);
        // li.contains(4);
        // li.addFirst(100);
        // li.addLast(101);
        // li.remove();
        // li.removeFirst();
        // li.removeLast();
        // li.removeAll(li2);

        // li.clear();
        // li.indexOf(3);


 

        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i));
            System.out.print("   ");
        }
    }
}
