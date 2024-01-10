

// throw --> using this key word throw exception
// throws  --> using this key word decleared that this function can be throw exception

public class ThrowThrows{

    // this divide method can be throw error so use throws key word
    public static int divide(int a,int b) throws Exception{ // it can be your costom exception
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Throw and Throws");



        try {
            divide(12, 0);  // it can be throw error so wrapped in try catch block

        } catch (Exception e) {
           System.out.println(e);
        }


        System.out.println("end of the program");
    }
}