package gui;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegisroClienteForm<JTextfield> extends JFrame {


public RegisroClienteForm() {
	setTitle("Registro de Cliente ");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,500);
	setLocationRelativeTo(null);
	
	//Configuración de GridBagLayout
	setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	
	//Etiqueta y campo de texto para Nombre y Apellido
	JLabel nombreApellidoLabel = new JLabel("Nombre y Apellido :");
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.weightx = 1;
	add(nombreApellidoLabel, gbc);
	
	JTextField nombreApellidoField = new JTextField(30);// ancho aumentado
	gbc.gridx = 1;
	gbc.gridy = 0;
	gbc.weightx = 1;
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	add(nombreApellidoField, gbc);
	
	//Etiqueta y campo de texto para Cédula
	JLabel cedulaLabel = new JLabel("Cédula :");
	gbc.gridx = 0;
	gbc.gridy = 1;
	//gbc.gridwidth = 1;
	add(cedulaLabel, gbc);
	
JTextField cedulaField = new JTextField(30); // Ancho aumentado
gbc.gridx = 1;
gbc.gridy = 1;
gbc.weightx =1;
gbc.gridwidth = GridBagConstraints.REMAINDER;
add(cedulaField, gbc);

//Panel para los botones Guardar y Cancelar
JButton guardarButton = new JButton("Guardar");
JButton cancelarButton = new JButton("Cancelar");
JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,0));
botonesPanel.add(guardarButton);
botonesPanel.add(cancelarButton);

gbc.gridx =0;
gbc.gridy =2;
gbc.gridwidth =2;
gbc.weightx=0;
gbc.anchor = GridBagConstraints.CENTER;
add(botonesPanel, gbc);


//Accion del botón Guardar
guardarButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreApellido = nombreApellidoField.getText();
		String cedula = cedulaField.getText();
		//aquí puedes agregar la Lógica para guardar los datos o mostrar una mensaje
		JOptionPane.showMessageDialog(null, "Cliente guardado:\n Nombre y Apellido: "+ nombreApellido + "\n Cédula: "+ cedula);	
	}
});
//Acción del botón Cancelar
cancelarButton.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();// Cierra la ventana actual
		
	}


});
}
public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
		RegisroClienteForm Form = new RegisroClienteForm();
		Form.setVisible(true);
    });
}
}