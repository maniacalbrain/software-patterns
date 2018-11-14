import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class BowlingDriver extends JFrame{

    private JPanel mainDriverPanel, panel, loginPanel, loginPage, homePanel, lanePanel, laneDetailsPanel, packagePanel, staffPanel;
    private CardLayout cardLayout;
    private static final int frameWidth = 310;
    private static final int frameHeight = 200;

    Lane lane1 = new Lane(1);
    Lane lane2 = new Lane(2);
    Lane lane3 = new Lane(3);
    Lane lane4 = new Lane(4);
    Lane lane5 = new Lane(5);


    public static void main(String[] args){
        BowlingDriver bd = new BowlingDriver();
        bd.setVisible(true);
        //Lane lane = new Lane(1);
        //Package bdd = new ChildBirthdayPackage(10);
    }

    public BowlingDriver() {

        ArrayList<Lane> lanes = new ArrayList();
        lanes.add(lane1);
        lanes.add(lane2);
        lanes.add(lane3);
        lanes.add(lane4);
        lanes.add(lane5);

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

        JButton lane1_btn = new JButton("Lane 1");
        lane1_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                laneDetailsPanel = createLaneDetailsPanel(lane1);
                mainDriverPanel.add(laneDetailsPanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(lane1_btn);
        JButton lane2_btn = new JButton("Lane 2");
        lane2_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                laneDetailsPanel = createLaneDetailsPanel(lane2);
                mainDriverPanel.add(laneDetailsPanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(lane2_btn);
        JButton lane3_btn = new JButton("Lane 3");
        lane3_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                laneDetailsPanel = createLaneDetailsPanel(lane3);
                mainDriverPanel.add(laneDetailsPanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(lane3_btn);
        JButton lane4_btn = new JButton("Lane 4");
        lane4_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                laneDetailsPanel = createLaneDetailsPanel(lane4);
                mainDriverPanel.add(laneDetailsPanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(lane4_btn);

        JButton lane5_btn = new JButton("Lane 5");
        lane5_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                laneDetailsPanel = createLaneDetailsPanel(lane5);
                mainDriverPanel.add(laneDetailsPanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(lane5_btn);

        JButton back_btn = new JButton("Back");
        back_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePanel = createHomePanel();
                mainDriverPanel.add(homePanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });
        panel.add(back_btn);

        return panel;
    }

    public JPanel createLaneDetailsPanel(Lane lane){
        panel = new JPanel(new FlowLayout());

        ArrayList<String> players = new ArrayList();

        JLabel lbl_player1 = new JLabel("Player1");
        JTextField txtfld_player1 = new JTextField(20);

        JLabel lbl_player2 = new JLabel("Player2");
        JTextField txtfld_player2 = new JTextField(20);

        JLabel lbl_player3 = new JLabel("Player3");
        JTextField txtfld_player3 = new JTextField(20);

        JLabel lbl_player4 = new JLabel("Player4");
        JTextField txtfld_player4 = new JTextField(20);

        JRadioButton default_btn = new JRadioButton("Default");
        default_btn.setSelected(true);

        JRadioButton pizza_btn = new JRadioButton("with Pizza");
        //pizza_btn.setSelected(true);

        JRadioButton cafe_btn = new JRadioButton("with Cafe Voucher");
        //cafe_btn.setSelected(true);


        JButton startGame_btn = new JButton("Start Game");
        startGame_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtfld_player1.getText().isEmpty()){
                    players.add(txtfld_player1.getText());
                }
                if(!txtfld_player2.getText().isEmpty()){
                    players.add(txtfld_player2.getText());
                }
                if(!txtfld_player3.getText().isEmpty()){
                    players.add(txtfld_player3.getText());
                }
                if(!txtfld_player4.getText().isEmpty()){
                    players.add(txtfld_player4.getText());
                }

                if(default_btn.isSelected()){
                    lane.start_game(players);
                }
                else if(pizza_btn.isSelected()){
                    lane.start_game_pizza(players);
                }
                else if(cafe_btn.isSelected()){
                    lane.start_game_cafe(players);
                }

            }
        });

        JButton endGame_btn = new JButton("End Game");
        endGame_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lane.end_game();
                players.clear();
            }
        });

        JButton back_btn = new JButton("Back");
        back_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lanePanel = createLanePanel();
                mainDriverPanel.add(lanePanel, "Lanes");
                cardLayout.show(mainDriverPanel, "Lanes");
            }
        });

        panel.add(lbl_player1);
        panel.add(txtfld_player1);
        panel.add(lbl_player2);
        panel.add(txtfld_player2);
        panel.add(lbl_player3);
        panel.add(txtfld_player3);
        panel.add(lbl_player4);
        panel.add(txtfld_player4);

        panel.add(default_btn);
        panel.add(pizza_btn);
        panel.add(cafe_btn);

        panel.add(startGame_btn);
        panel.add(endGame_btn);
        panel.add(back_btn);




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
