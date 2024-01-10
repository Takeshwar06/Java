public class TextException {
    static int divide(int a,int b) throws Exception{
        return (a/b);
    }
    public static void main(String ...arg){


        try {
           System.out.println(divide(9,0));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
