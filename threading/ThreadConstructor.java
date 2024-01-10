class MythrRunnable implements Runnable{
    public void run(){
        System.out.println("Hello runnable");
    }
}
class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }

    public void run (){
        System.out.println("hello");
    }
}
public class ThreadConstructor{

    public static void main(String arg[]){
        System.out.println("Constructor from Thread");
        Mythr m=new Mythr("tiger"); // this construcor set the costructor name "tiger";
        m.start(); // it is run after running getId() and getName()
        System.out.println(m.getId()); // you can get id of thread and name also
        System.out.println(m.getName());

        // using runnable arg+ String arg thread

        MythrRunnable  b =new MythrRunnable();
        Thread g = new Thread(b,"tiger");
        g.start(); // it is run after running getId() and getName()
        System.out.println(g.getId());
        System.out.println(g.getName());
    }
}