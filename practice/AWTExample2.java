import java.awt.*;
public class AWTExample2 {
  AWTExample2(){
    Frame f  = new Frame(); // it is a container
    
    Label l = new Label("Search");

    Button b = new Button("Submit");

    TextField t = new TextField();
 
    l.setBounds(20,80,80,30);
    t.setBounds(20,100,80,30);
    b.setBounds(100,100,80,30);

    f.add(b);
    f.add(t);
    f.add(l);
 
    f.setSize(400, 300);
    f.setTitle("tiger again");
    f.setLayout(null);
    f.setVisible(true);
    
  }
    public static void main(String ...arg){
      AWTExample2 A = new AWTExample2();
    }
}
