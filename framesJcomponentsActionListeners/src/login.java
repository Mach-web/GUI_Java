import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame{
    private String username;
    private String password;

    private JLabel lbluser;
    private JTextField txtuser;
    private JLabel lblpwd;
    private JPasswordField txtpwd;
    private JButton btnlogin;

    public login(){
        setVisible(true);
//        setLayout(new GridLayout(3,2));
        setLayout(new FlowLayout());
        setBounds(350, 450, 300, 350);
        setSize(300, 300);
        lbluser = new JLabel("Username: ");
        txtuser = new JTextField(20);
        lblpwd = new JLabel("Password: ");
        txtpwd = new JPasswordField(20);
        btnlogin = new JButton("Log in");
        myActionListener mal = new myActionListener();
        txtuser.addActionListener(mal);
        txtpwd.addActionListener(mal);
        btnlogin.addActionListener(mal);
        add(lbluser);
        add(txtuser);
        add(lblpwd);
        add(txtpwd);
        add(btnlogin);
        }
        private class myActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnlogin) {
                    String user = txtuser.getText();
                    String pwd = txtpwd.getText();
                    if (user.equalsIgnoreCase("Mash") && pwd.equals("123456789")) {
                        JOptionPane.showMessageDialog(null, "Login was successfull",
                                "LOGIN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login was unsuccessfull",
                                "LOGIN", JOptionPane.WARNING_MESSAGE);
                        new login();
                    }

                }

            }
        }
        public static void main(String[] args){
            new login();
            }

}
