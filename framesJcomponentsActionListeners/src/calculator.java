import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;

public class calculator extends JFrame {
    private JLabel no1_lbl = new JLabel("Enter the first number: ");
    private JTextField no1_txt = new JTextField(5);
    private JLabel no2_lbl = new JLabel("Enter the second number: ");
    private JTextField no2_txt = new JTextField(5);
    private JButton add_btn = new JButton("+");
    private JButton sub_btn = new JButton("-");
    private JButton multi_btn = new JButton("*");
    private JButton div_btn = new JButton("/");
//    Double result;
//    private JLabel answer = new JLabel("The result is: ", String.valueOf(result));
    myActionListener action = new myActionListener();

    public calculator(){
        setSize(200, 200);
        setBounds(450, 350, 300, 250);
        setVisible(true);
        setLayout(new FlowLayout());
        add_btn.addActionListener(action);
        sub_btn.addActionListener(action);
        multi_btn.addActionListener(action);
        div_btn.addActionListener(action);
        add(no1_lbl);add(no1_txt);add(no2_lbl);add(no2_txt);
        add(add_btn);add(sub_btn);add(multi_btn);add(div_btn);
//        JLabel answer = new JLabel("Answer: "+ String.valueOf(result));
//        answer.setText(String.valueOf(result));
//        add(answer);
    }
    public class myActionListener implements ActionListener{
        Double result;
        JButton answer = new JButton();
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == add_btn) {
                result = Double.parseDouble(no1_txt.getText()) + Double.parseDouble(no2_txt.getText());
                answer.setText("The sum is: "+ String.valueOf(result));
                answer.setEnabled(false);
                answer.setBackground(Color.yellow);
                add(answer);
            }
            else if(e.getSource() == sub_btn) {
                result = Double.parseDouble(no1_txt.getText()) - Double.parseDouble(no2_txt.getText());
                answer.setText("The difference is: "+ String.valueOf(result));
                answer.setEnabled(false);
                answer.setBackground(Color.darkGray);
                add(answer);
            }
            else if(e.getSource() == multi_btn) {
                result = Double.parseDouble(no1_txt.getText()) * Double.parseDouble(no2_txt.getText());
                answer.setText("The product is: "+ String.valueOf(result));
                answer.setEnabled(false);
                answer.setBackground(Color.blue);
                add(answer);
            }
            else if(e.getSource() == div_btn) {
                result = Double.parseDouble(no1_txt.getText()) / Double.parseDouble(no2_txt.getText());
                answer.setText("The division is: "+ String.valueOf(result));
                answer.setEnabled(false);
                answer.setBackground(Color.red);
                add(answer);
            }

        }
    }
    public static void main(String [] args){
        new calculator();
    }
}
