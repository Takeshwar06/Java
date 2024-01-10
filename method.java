


class method{
    // 1. method 
    static void printHello(){
        System.out.println("hello");
    }
    // 2. method
    static int sum(int a,int b){
        return (a+b);
    }
    public static void main(String [] args){
        System.out.println("---method---");
        printHello();

        System.out.println(sum(5,5));
    }
}