
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Math implements ActionListener
{
    JFrame frame1;
    JLabel num1, num2, result;
    JTextField num1Txt, num2Txt, resultTxt;
    JButton plus, minus, clear;
    
    public Math(){
        
        frame1 = new JFrame();
        num1 = new JLabel();
        num2 = new JLabel();
        result = new JLabel();
        
        num1Txt = new JTextField();
        num2Txt = new JTextField();
        resultTxt = new JTextField();
        
        plus = new JButton();
        minus = new JButton();
        clear = new JButton();
        
        plus.addActionListener(this);
        minus.addActionListener(this);
        clear.addActionListener(this);
        
        num1.setText("Number 1: ");
        num2.setText("Number 2: ");
        result.setText("Result :");
        
        plus.setText("+");
        minus.setText("-");
        clear.setText("C");
        
        num1.setBounds(100, 200, 100, 20);
        num2.setBounds(100, 270, 100, 20);
        result.setBounds(100, 340, 100, 20);
        
        num1Txt.setBounds(220, 200, 150, 20);
        num2Txt.setBounds(220, 270, 150, 20);
        resultTxt.setBounds(220, 340, 150, 20);
        
        plus.setBounds(100, 420, 70, 40);
        minus.setBounds(200, 420, 70, 40);
        clear.setBounds(300, 420, 70, 40);
        
        frame1.add(num1);
        frame1.add(num2);
        frame1.add(result);
        
        frame1.add(num1Txt);
        frame1.add(num2Txt);
        frame1.add(resultTxt);
        
        frame1.add(plus);
        frame1.add(minus);
        frame1.add(clear);
        
        
        frame1.setLayout(null);
        frame1.setSize(500, 800);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(num1Txt.getText());
        int b = Integer.parseInt(num2Txt.getText());
        int c = 0;
        if(ae.getSource() == plus)
        {
            c = a + b;
            
            JOptionPane.showMessageDialog(frame1, "Numbers have been added","Add dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(ae.getSource() == minus)
        {
            c = a - b;
            
            JOptionPane.showMessageDialog(frame1, "Numbers have been subtracted", "Subtract dialog", JOptionPane.INFORMATION_MESSAGE );
        }
        else
        {
            num1Txt.setText("");
            num2Txt.setText("");
            resultTxt.setText("");
            
            JOptionPane.showMessageDialog(frame1, "Cleared!", "clear dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        String d = String.valueOf(c);
        resultTxt.setText(d);
    }
    
}
