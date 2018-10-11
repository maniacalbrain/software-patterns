import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class BowlingDriver extends JFrame{

    private JPanel mainDriverPanel;
    private CardLayout cardLayout;
    private static final int frameWidth = 310;
    private static final int frameHeight = 200;


    public static void main(String[] args){
        BowlingDriver bd = new BowlingDriver();
        bd.setVisible(true);
        //Lane lane = new Lane(1);
        //Package bdd = new ChildBirthdayPackage(10);
    }

    public BowlingDriver(){
        Container cont = getContentPane();
    }


}
