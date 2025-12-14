import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Multiplier extends JFrame implements ActionListener{
    private JLabel Label1;
    private JTextField TextField1;
    
    private JLabel Label2;
    private JTextField TextField2;
    
    private JLabel Label3;
    private JTextField TextField3;
    
    private JLabel Label4;
    
    private JLabel Label5;
    
    private JButton Button;
    
    //private JPanel Panel = new JPanel();

    public Multiplier(){
        setLayout(new FlowLayout());
        
        Label1 = new JLabel("First");
        add(Label1);
        
        TextField1 = new JTextField(10);
        add(TextField1);
        
        Label2 = new JLabel("Second");
        add(Label2);
        
        TextField2 = new JTextField(10);
        add(TextField2);
        
        Label3 = new JLabel("Result");
        add(Label3);
        
        TextField3 = new JTextField(10);
        add(TextField3);
        
        Label4 = new JLabel("+");
        
        Label5 = new JLabel("=");
        
        Button = new JButton("Multiplie");
        add(Button);
        Button.addActionListener(this);
        
        setTitle("My Multiplier");
        setSize(280,150);
        setVisible(true);
    }  

    @Override
    public void actionPerformed(ActionEvent evt) {
        String L1 = TextField1.getText();
        String L2 = TextField2.getText();
        
        int num1 = Integer.valueOf(L1);
        int num2 = Integer.valueOf(L2);
        
        int result = num1 * num2;
        
        TextField3.setText(result + "");
        
    }
    
    public static void main(String[] args) {
        Multiplier app = new Multiplier();
    }
}
