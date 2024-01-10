
class employee{
    String name;
    long id;
    int salary;
    public void setInfo(String name ,long id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void getInfo(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("salary: "+salary);
    }
}

public class customClass{
    public static void main(String [] args){
        System.out.println("---custom class---");
        
        employee emp =new employee();
        employee next=new employee();
        next.setInfo("takeshwar",6267822881L,500000);
        emp.setInfo("tiger",6267822881L,30000);
        next.getInfo();
        emp.getInfo();
    }
}