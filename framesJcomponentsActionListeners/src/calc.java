import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;

public class calc extends JFrame implements ActionListener{
    private JLabel no1_lbl = new JLabel("Enter the first number: ");
    private JTextField no1_txt = new JTextField(5);
    private JLabel no2_lbl = new JLabel("Enter the second number: ");
    private JTextField no2_txt = new JTextField(5);
    private JButton add_lbl = new JButton("+");
    private JButton sub_lbl = new JButton("-");
    private JButton multi_lbl = new JButton("*");
    private JButton div_lbl = new JButton("/");
    public Double result;
    //    private JLabel answer = new JLabel("The result is: ", String.valueOf(result));

    public calc(){
        setSize(200, 200);
        setBounds(450, 350, 300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        add_lbl.addActionListener(this);
        sub_lbl.addActionListener(this);
        multi_lbl.addActionListener(this);
        div_lbl.addActionListener(this);
        add(no1_lbl);add(no1_txt);add(no2_lbl);add(no2_txt);
        add(add_lbl);add(sub_lbl);add(multi_lbl);add(div_lbl);
        JLabel answer = new JLabel("Answer: "+ String.valueOf(result));
//        answer.setText(String.valueOf(result));
        add(answer);
    }

        public void actionPerformed(ActionEvent e){
        if(e.getSource() == add_lbl) {
                this.result = Double.parseDouble(no1_txt.getText()) + Double.parseDouble(no2_txt.getText());
//                System.out.println(result);
            }
            else if(e.getSource() == sub_lbl) {
                this.result = Double.parseDouble(no1_txt.getText()) - Double.parseDouble(no2_txt.getText());
                System.out.println(result);
            }
            else if(e.getSource() == multi_lbl) {
                this.result = Double.parseDouble(no1_txt.getText()) * Double.parseDouble(no2_txt.getText());
                System.out.println(result);
            }
            else if(e.getSource() == div_lbl) {
                this.result = Double.parseDouble(no1_txt.getText()) / Double.parseDouble(no2_txt.getText());
                System.out.println(result);
            }

        }
    public static void main(String [] args){
        new calc();
    }
}
