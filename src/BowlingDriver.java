import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class BowlingDriver extends JFrame{

    private JPanel mainDriverPanel, panel, loginPanel, loginPage, homePanel;
    private CardLayout cardLayout;
    private static final int frameWidth = 310;
    private static final int frameHeight = 200;


    public static void main(String[] args){
        BowlingDriver bd = new BowlingDriver();
        bd.setVisible(true);
        //Lane lane = new Lane(1);
        //Package bdd = new ChildBirthdayPackage(10);
    }

    public BowlingDriver() {

        setTitle("Bowling System");
        setSize(frameWidth, frameHeight);

        Container cont = getContentPane();

        mainDriverPanel = new JPanel(new CardLayout());
        cardLayout = (CardLayout) (mainDriverPanel.getLayout());

        loginPanel = createLoginPanel();
        mainDriverPanel.add(loginPanel, "Login");
        cardLayout.show(mainDriverPanel, "Login");

        loginPage = createLogin();
        mainDriverPanel.add(loginPage, "Login Page");

        cont.add(mainDriverPanel);
    }



        public JPanel createLoginPanel(){
            panel = new JPanel(new GridLayout(0,1));
            JButton login = new JButton("Login");
            login.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainDriverPanel, "Login Page");
                }
            });
            panel.add(login);
            return panel;
    }

    public JPanel createLogin(){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lbl_login = new JLabel("Login");
        JTextField txtfld_login = new JTextField(20);
        JButton btn_login = new JButton("Login");
        btn_login.addActionListener(new ActionListener() {
                                        //loads player details from arraylist
                                        public void actionPerformed(ActionEvent e) {
                                            homePanel = createHomePanel();
                                            mainDriverPanel.add(homePanel, "Home");
                                            cardLayout.show(mainDriverPanel, "Home");
                                        }
                                    });
        panel.add(lbl_login);
        panel.add(txtfld_login);
        panel.add(btn_login);
        return panel;
    }

    public JPanel createHomePanel(){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lbl_login = new JLabel("Home");
        panel.add(lbl_login);
        return panel;
    }




}
