import org.w3c.dom.TypeInfo;

class MyGeneric<T>{
    T obj;
    MyGeneric(T obj){
        this.obj=obj;
        System.out.println(obj);
    }
}
public class GenericMethod {

    public static <E> void genericMethod(E[] elements){
        System.out.println("elements are:: ");
        for (E element : elements){
            System.out.println(element);
        }
    }

    public static void main(String ...a){
    //    MyGeneric<Integer> t = new MyGeneric();
    Integer[] arr={2,2,2,2,2};
    String [] str={"tiger","amit","takesh","amit"};
    genericMethod(arr);
    genericMethod(str);

    }
    
}
