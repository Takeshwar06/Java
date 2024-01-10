import javax.swing.*;
class MySwing {
    JFrame f;
    JTextField t;
    MySwing(){
        t = new JTextField();
        t.setBounds(100, 50, 80, 50);
        JButton b= new JButton("click");
        b.setBounds(100 , 140, 40, 50);
     
        f.add(t);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

  
}
public class Swing { 

    public static void main(String ...g){
      new MySwing();
    }
}
