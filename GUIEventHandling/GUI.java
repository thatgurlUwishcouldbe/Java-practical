import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    private JTextField textF;
    private JLabel label;
    private JTextField textF2;
    private JLabel label2;
    private JButton buttonI;
    private JButton buttonII;
    
    private JPanel panelI;
    private JPanel panelII;
    private JPanel panelIII;
    
    public GUI(){
        setLayout(new FlowLayout());
        setTitle("C to F");
        setSize(280,150);
        setVisible(true);
        
        panelI = new JPanel();
        textF = new JTextField(10);
        label =  new JLabel("your C value");
        panelI.add(textF);
        panelI.add(label);
        
        
        panelII = new JPanel();
        textF2 = new JTextField(10);
        label2 =  new JLabel("the result");
        textF2.setEditable(false);
        panelII.add(textF2);
        panelII.add(label2);
        
        
        panelIII = new JPanel();
        buttonI = new JButton("Convert");
        panelIII.add(buttonI);
        buttonI.addActionListener(this);
        buttonII = new JButton("Clear");
        panelIII.add(buttonII);
        buttonII.addActionListener(this);
        
        add(panelI);
        add(panelII);
        add(panelIII);
    }
    
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == buttonI){
            String X = textF.getText();
            double x = Double.valueOf(X);
            
            try {
                double res = (x * 9.0 / 5) + 32;
                textF2.setText(res + "");
            } catch (NumberFormatException e) {
                textF2.setText("Invalid input");
            }

        }else{
            textF.setText("");
            textF2.setText("");
        }
    }
    
    public static void main(String[] args){
        GUI demo = new GUI();
    } 
}
