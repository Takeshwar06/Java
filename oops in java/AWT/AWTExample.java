package AWT;
import java.awt.*;

public class AWTExample extends Frame {
    AWTExample(){

        Button b = new Button("Click");

        b.setBounds(30, 100, 80, 30);

        add(b);
        setSize(300, 300);

        setTitle("tiger is king");

        setLayout(null);

        setVisible(true);

    }
    public static void main(String ...arg){
           AWTExample A = new AWTExample();
    }    
}
