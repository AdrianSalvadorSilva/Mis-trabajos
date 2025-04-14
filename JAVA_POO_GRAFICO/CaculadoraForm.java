package gui;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaculadoraForm {
public static void main(String[] args) {
 JFrame calculadora = new JFrame("Calculadora v1");
 calculadora.setSize(300,300);
 calculadora.setResizable(false);
 calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 calculadora.setLayout(new GridLayout(3,1));
  
 JPanel panel = new JPanel(new GridLayout(3,1));
 JTextField tNum1 = new JTextField();
 JTextField tNum2 = new JTextField();
 JButton bSumar = new JButton("+");
 JLabel display = new JLabel("0");
 
 bSumar.addActionListener(new ActionListener() {
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 double n1 = Double.parseDouble(tNum1.getText());
		 double n2 = Double.parseDouble(tNum2.getText());
		 double r = n1 + n2;
		 display.setText(String.valueOf(r));
	 }
 });
 panel.add(tNum1);
 panel.add(tNum2);
 panel.add(display);
 panel.add(bSumar);
 
 calculadora.add(panel);
 calculadora.setVisible(true);;
 }
}

