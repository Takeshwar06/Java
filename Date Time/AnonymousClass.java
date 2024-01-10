@FunctionalInterface
interface Lambda{
    void lambdafunc(int a); // we can directly call if FunctionalInterface exist it is called Lambda
}


interface DemoAno{
    void display1();
    void display2();
}

public class AnonymousClass {
    // Anonymous class --> it is not a ectual class it is define for single object and only one time used
    public static void main(String[] args) {
    // using anonymous class directly define a class thats called anonymous class

        DemoAno o = new DemoAno() {
            @Override
            public void display1(){
                System.out.println("this is anonymous class1 ");
            }
            @Override
            public void display2(){
                System.out.println("this is anonymous class2");
            }
        };

        // o.display1();
        // o.display2();

 /*
if i hava a interface which has only one function that means
FunctionalInterface then we can call that function withoud implementation
*/
     Lambda l = (a)->{
        System.out.println("this is lambda expression "+a);
     };

    l.lambdafunc(4); // you can send parametter
    }
    
}
