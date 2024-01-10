

class Employee{
    String name;
    int age;
    Employee(){
       name="_____ ";
       age=0;
    }
    Employee(String name,int age){   
      this.name=name;
      this.age=age;
    }
}
public class constructor{

    public static void main(String [] args){
        System.out.println("---constructor---");
        
        Employee m = new Employee();
        Employee m1=new Employee("tiger ",21);

        System.out.println("m.name--> "+m.name+"m.age--> "+m.age);
        System.out.println("m1.name--> "+m1.name+"m1.age--> "+m1.age);
    }
}