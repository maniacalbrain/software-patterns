import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


class BowlingGUI extends JFrame{

    private static BowlingGUI instance;

    private JPanel mainDriverPanel;
    private JPanel panel;
    private JPanel loginPanel;
    private JPanel loginPage;
    private JPanel homePanel;
    private JPanel lanePanel;
    private JPanel laneDetailsPanel;
    private JPanel packagePanel;
    private JPanel staffPanel;
    private CardLayout cardLayout;
    private static final int frameWidth = 310;
    private static final int frameHeight = 200;

    LaneInterface lane1 = new LaneAdapter(1);
    LaneInterface lane2 = new LaneAdapter(2);
    LaneInterface lane3 = new LaneAdapter(3);
    LaneInterface lane4 = new LaneAdapter(4);
    LaneInterface lane5 = new LaneAdapter(5);

    LaneMaintenance laneMaintenance = new LaneMaintenance(Database.getInstance());

    Staff cs1 = new CounterStaff("CS1", new GrantAccessTill(),
            new GrantAccessReport(),
            new RestrictMaintenance());
    Staff ts1 = new TechnicalStaff("TS1",
            new GrantAccessTill(), new RestrictAccessReport(),
            new GrantMaintenance());
    Staff ps1 = new PartyStaff("PS1",
            new RestrictAccessTill(),
            new RestrictAccessReport(), new RestrictMaintenance());

    ArrayList<Staff> staffList = new ArrayList<Staff>();

    private BowlingGUI() {

        ArrayList<LaneInterface> lanes = new ArrayList();
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

    public static BowlingGUI getInstance(){
        if(instance == null){
            instance = new BowlingGUI();
        }
        return instance;
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

        JButton btn_packages = new JButton("Parties");
        btn_packages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                packagePanel = createPackagePanel();
                mainDriverPanel.add(packagePanel, "Parties");
                cardLayout.show(mainDriverPanel, "Parties");
            }
        });

        JButton btn_staff = new JButton("Staff");
        btn_staff.addActionListener(new ActionListener() {
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

    public JPanel createLaneDetailsPanel(LaneInterface lane){
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

        JRadioButton cafe_btn = new JRadioButton("with Cafe Voucher");


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

                Game game = new BasicGame(players);

                if(pizza_btn.isSelected()){
                    game = new Pizza(game);
                }
                else if(cafe_btn.isSelected()){
                    game = new Cafe(game);
                }

                lane.startGame(game);
                players.clear();
            }
        });

        JButton endGame_btn = new JButton("End Game");
        endGame_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lane.endGame();
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
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JRadioButton kids_bowling_btn = new JRadioButton("Kids Bowling Party");
        kids_bowling_btn.setSelected(true);

        JRadioButton kids_playground_btn = new JRadioButton("Kids Playground Party");

        JRadioButton teen_bowling_btn = new JRadioButton("Teen Neon Bowling");

        JRadioButton teen_bowl_arc_btn = new JRadioButton("Teen Bowling & Arcade");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(kids_bowling_btn);
        buttonGroup.add(kids_playground_btn);
        buttonGroup.add(teen_bowling_btn);
        buttonGroup.add(teen_bowl_arc_btn);

        JButton book_btn = new JButton("Book Party");
        book_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(kids_bowling_btn.isSelected()){
                    BookChildsParty("Bowl");
                }
                else if(kids_playground_btn.isSelected()){
                    BookChildsParty("Play");
                }
                else if(teen_bowling_btn.isSelected()){
                    BookTeensParty("Bowl");
                }
                else if(teen_bowl_arc_btn.isSelected()){
                    BookTeensParty("Arcade");
                }
            }
        });

        JButton back_btn = new JButton("Back");
        back_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePanel = createHomePanel();
                mainDriverPanel.add(homePanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });


        panel.add(kids_bowling_btn);
        panel.add(kids_playground_btn);
        panel.add(teen_bowling_btn);
        panel.add(teen_bowl_arc_btn);
        panel.add(book_btn);

        panel.add(back_btn);

        return panel;
    }

    public void BookChildsParty(String type){
        PartyBooker pb = new ChildPartyFactory();
        Party party = pb.bookParty(type);
    }

    public void BookTeensParty(String type){
        PartyBooker pb = new TeenPartyFactory();
        Party party = pb.bookParty(type);
    }


    public JPanel createStaffPanel(){
        panel = new JPanel(new GridLayout(2,2));

        staffList.clear();
        staffList.add(cs1);
        staffList.add(ts1);
        staffList.add(ps1);

        JButton staff_btn = new JButton("Show Staff");
        staff_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Staff staff: staffList){
                    System.out.print(staff.name + " ");
                    staff.accessTill();
                }
            }
        });

        JButton back_btn = new JButton("Back");
        back_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePanel = createHomePanel();
                mainDriverPanel.add(homePanel, "Home");
                cardLayout.show(mainDriverPanel, "Home");
            }
        });

        panel.add(staff_btn);

        panel.add(back_btn);

        return panel;
    }
}
