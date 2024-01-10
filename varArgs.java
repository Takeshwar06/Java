  

// it is also called  destucturing and spread operator  ...a

public class varArgs{

    static int sum(int ...arr){

        int result=0;
        for(int element:arr){
            result+=element;
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println("---Var Argument---");
        
        System.out.println("sum of nothing: " + sum());
        System.out.println("sum of 5,5: " + sum(5,5));
        System.out.println("sum of 5,5,5: " + sum(5,5,5));
        System.out.println("sum of 5,5,5,5: " + sum(5,5,5,5));
    }
}