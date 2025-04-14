package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LonginForm {
public static void main(String[] args) {
	JFrame ventana = new JFrame("Vuenobus | Lonig");
	ventana.setSize(300, 200);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventana.setResizable(false);// no redimecinado
	ventana.setLayout(new GridLayout(3,1));
	
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(3,1));

	JPanel usuario = new JPanel();
	usuario.setToolTipText(" Usuario: ");
	JTextField tUsuario = new JTextField(); 
	
	JPanel contrasenha = new JPanel();
	contrasenha.setToolTipText("Contraseña");
	JTextField tContrasenha = new JTextField();
	
	JButton bIngresar = new JButton("Acceder");
	bIngresar.addActionListener(new ActionListener() {
		 

		@Override
		public void actionPerformed(ActionEvent e) {
		String usuario = tUsuario.getText();
		String password = tContrasenha.getText();
		String mesaje = "";
		int tipo;
		if(usuario.equals("admin") && password.equals("12345")) {
			mesaje = "Acceso correcto";
			tipo =2;
		}else {mesaje = "Acceso correcto"; tipo =1;}
		JOptionPane.showConfirmDialog(ventana, mesaje, "Mensaje: ",tipo);
		}
		});
	
	panel.add(usuario);
	panel.add(tUsuario);
	panel.add(contrasenha);
	panel.add(tContrasenha);
	panel.add(bIngresar);
	
	ventana.add(panel);
	ventana.setVisible(true);
 
}
}
