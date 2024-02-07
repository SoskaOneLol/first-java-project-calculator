import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class CalcGUI {
    private JFrame mainFrame;
    protected static JLabel headerInputOutput;
    protected JPanel buttonPanel;

    public CalcGUI(){
        prepareGUI();
    }

    public static void CalcGUIEventDemo(String[] args) {
        CalcGUI calcGUI = new CalcGUI();
        calcGUI.showEventDemo();
    }
    private void prepareGUI() {
        ImageIcon icon = new ImageIcon("C:\\Users\\soska\\projects\\study\\calculator\\src\\icon\\icon.jpg");
        mainFrame = new JFrame("Motivated Calculator");
        mainFrame.getContentPane().setBackground(new Color(60, 151, 169));
        mainFrame.setSize(320, 450);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setIconImage(icon.getImage());
        headerInputOutput = new JLabel("", JLabel.LEFT);
        headerInputOutput.setFont(new Font("Noto Sans", Font.BOLD, 24));
        headerInputOutput.setPreferredSize(new Dimension(300, 120));
        headerInputOutput.setBackground(new Color(75, 189, 212));
        headerInputOutput.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.black));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        mainFrame.add(headerInputOutput);
        mainFrame.add(buttonPanel);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
    private void showEventDemo(){
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton equals = new JButton("=");
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton del = new JButton("C");
        ArrayList<JButton> buttons = new ArrayList<>(Arrays.asList(one,two,three,minus,four,five,six,plus,seven,eight,nine,equals,divide,zero,multiply,del));
        for(int i = 0; i < buttons.size(); i++){
            JButton jButton = buttons.get(i);
            buttonPanel.add(jButton);
            jButton.setPreferredSize(new Dimension(70, 70));
            jButton.setFont(new Font("Noto Sans", Font.BOLD, 24));
            jButton.setBackground(new Color(60, 151, 169));
            jButton.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.black));
            jButton.addActionListener(new Actions.ButtonClickListener());
        }
        mainFrame.setVisible(true);
    }
}