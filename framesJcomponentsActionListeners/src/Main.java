import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    private JButton btn1 = new JButton("Click me");
    private myActionListener mal = new myActionListener();

    public Main(){
        setSize(200, 200);
        setBounds(450, 350, 200, 200);
        setVisible(true);
        btn1.addActionListener(mal);
        add(btn1);
    }

    private  class myActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            System.out.println("Hello world!");
        }
    }
    public static void main(String[] args) {
        new Main();

    }
}