import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>(3);
      arr2.add(11);
      arr2.add(11);
      arr2.add(11);
    
      arr.add(1);
      arr.add(2);
      arr.add(3);
      arr.add(4);
      arr.add(5);
     
      arr.addAll(0, arr2); // if you want to add a ArrayList in ArrayList
    
    //   arr.add(0,0); // it is add 0th index without remove 1

    //   arr.set(0, -1); // it is set 0th index and remove first value  
     

    // arr.clear();
    // arr.contains(4); return true or false;
    // System.out.println(arr.contains(4));
    
    // arr.indexOf(3);// if 3 is present in array then its return indexof 3
    // System.out.println(arr.indexOf(2));
    // System.out.println(arr.lastIndexOf(2)); 

    // arr.remove(0);
    // arr.size();
    // arr.set(0,23);
    System.out.println("isEmpty()-->"+arr.isEmpty());
    
      for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i));
        System.out.print(", ");
      }
    }
}
