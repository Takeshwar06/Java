

/*
 Annotations --> it is used to provide Extra information about a program
                      and it is also provide metadata to class/methods    
                      
    1) @Override  --> used to mark override function                   
    2) @SuppressWarnings --> used to supress the warning supreses means-->avoid and run withoug showing warning
    3) @Deprecated --> used to mark deprecate any method 
    4) @FunctionalInterface --> a interface can be only one method  (it is insure this) 
*/

@FunctionalInterface
interface Myinterface{
    void method1();
    // void method2();// it is not possible because FunctionalInerface can allow only one method in a interface it is rule
}

class Parent {
    void feePay(){
        System.out.println("parents fee pay");
    }
}

class Child extends Parent{
    @Override
 // show error if you will not override function 
    void feePay(){
        System.out.println("child fee pay");
    }
 

    @Deprecated
    // mark deprecated so show hint this is deprecated you can not use this method
    int sum(int a, int b){
        return a+b;
    }
}
public class Annotations { 
     @SuppressWarnings("deprecation")
     // so in this main function will not show warnings because it is suppresssed now 
       public static void main(String[] args) {
         
        Child c = new Child();
        c.feePay();
        c.sum(12, 12);  //  this function Deprecated so run with warning but if use SupresssWarnings then it run without warning 

       }
    
}
