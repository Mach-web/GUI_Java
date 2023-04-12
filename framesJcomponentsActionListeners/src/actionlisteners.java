import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class actionlisteners extends JFrame implements ActionListener{
    private JButton btn1;
    private JButton btn2;
    public actionlisteners(){
        setSize(200, 200);
        setBounds(450, 350, 200, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        btn1 = new JButton();
        btn2 = new JButton();
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            System.out.println("I am button 1");
        } else if (e.getSource() == btn2) {
            System.out.println("I am button 2");
        }
    }
    public static void main(String[] args){
        new actionlisteners();

    }
}
