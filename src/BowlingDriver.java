import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class BowlingDriver extends JFrame{

    private JPanel mainDriverPanel, panel, loginPanel, loginPage, homePanel, lanePanel, packagePanel, staffPanel;
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
        //panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel = new JPanel(new GridLayout(0,2));

        JButton btn_lanes = new JButton("Lanes");
        btn_lanes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lanePanel = createLanePanel();
                mainDriverPanel.add(lanePanel, "Lanes");
                cardLayout.show(mainDriverPanel, "Lanes");
            }
        });

        JButton btn_packages = new JButton("Packages");
        btn_packages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                packagePanel = createPackagePanel();
                mainDriverPanel.add(packagePanel, "Packages");
                cardLayout.show(mainDriverPanel, "Packages");
            }
        });

        JButton btn_staff = new JButton("Staff");
        btn_packages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                staffPanel = createStaffPanel();
                mainDriverPanel.add(staffPanel, "Staff");
                cardLayout.show(mainDriverPanel, "Staff");
            }
        });

        panel.add(btn_lanes);
        panel.add(btn_packages);
        panel.add(btn_staff);
        JLabel lbl_home4 = new JLabel("Home4");
        panel.add(lbl_home4);
        return panel;
    }

    public JPanel createLanePanel(){

        panel = new JPanel(new GridLayout(0,2));

        Lane lane1 = new Lane(1);
        Lane lane2 = new Lane(2);
        Lane lane3 = new Lane(3);
        Lane lane4 = new Lane(4);
        Lane lane5 = new Lane(5);

        ArrayList<Lane> lanes = new ArrayList();
        lanes.add(lane1);
        lanes.add(lane2);
        lanes.add(lane3);
        lanes.add(lane4);
        lanes.add(lane5);

        JButton lane1_btn = new JButton("Lane 1");
        panel.add(lane1_btn);
        JButton lane2_btn = new JButton("Lane 2");
        panel.add(lane2_btn);
        JButton lane3_btn = new JButton("Lane 3");
        panel.add(lane3_btn);
        JButton lane4_btn = new JButton("Lane 4");
        panel.add(lane4_btn);
        JButton lane5_btn = new JButton("Lane 5");
        panel.add(lane5_btn);

        return panel;
    }

    public JPanel createPackagePanel(){
        panel = new JPanel(new GridLayout(0,2));

        return panel;
    }

    public JPanel createStaffPanel(){
        panel = new JPanel(new GridLayout(0,2));

        return panel;
    }




}
