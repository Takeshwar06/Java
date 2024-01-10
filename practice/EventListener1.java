import java.awt.*;
import java.awt.event.*;

public class EventListener1 extends Frame implements ActionListener{

    TextField tf;

    EventListener1(){
          super("tiger tiger");
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b= new Button("click");
        b.setBounds(100,120,80,30);

        b.addActionListener(this);

        add(b);add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
       System.out.println(e);
        tf.setText("ttt");
    }
     public static void main(String ...ager){
        new EventListener1(); 
       
    }
}