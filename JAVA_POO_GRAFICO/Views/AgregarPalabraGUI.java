package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Conexion;

public class AgregarPalabraGUI extends JFrame {
private JTextField campoEspanol;
private JTextField campoIngles;
private JButton botonAgregar;

public AgregarPalabraGUI() {
	setTitle("Agregar palabra al Diccionario");
	setSize(300, 200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	
	JLabel labelEspanol = new JLabel("Español");
	labelEspanol.setBounds(30, 30, 60, 25);
	add(labelEspanol);
	
	campoEspanol =new JTextField();
	campoEspanol.setBounds(100, 30, 150, 25);
	add(campoEspanol);
	
	JLabel labelIngles = new JLabel("Ingles");
	labelIngles.setBounds(30, 50, 60, 25);
	add(labelIngles);
	
	campoIngles =new JTextField();
	campoIngles.setBounds(100, 50, 150, 25);
	add(campoIngles);
	
	botonAgregar = new JButton("Agregar");
	botonAgregar.setBounds(110, 100, 100, 30);
	add(botonAgregar);
	
	botonAgregar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			agregarPalabra();
		}
	});
	setVisible(true);
}

private void  agregarPalabra() {
	String espanol = campoEspanol.getText().trim();
	String ingles = campoIngles.getText().trim();
	
	if(espanol.isEmpty() || ingles.isEmpty()) {
		JOptionPane.showConfirmDialog(this, "Completa ambos campos. ", " ERROR", JOptionPane.ERROR_MESSAGE );
		return;
	}
	try {
		Conexion c = new Conexion();
		String sql ="insert into traducciones (espanol, ingles) Values(?,?)";
		PreparedStatement ps = c.conexion.prepareStatement(sql);
		ps.setString(1, espanol);
		ps.setString(2, ingles);
		int filas = ps.executeUpdate();
		if(filas > 0) {
			JOptionPane.showMessageDialog(this, "Palabra agregada con éxito.",
					"Éxito",JOptionPane.INFORMATION_MESSAGE);
			campoEspanol.setText("");
			campoIngles.setText("");
		}
		ps.close();
	}catch (Exception ex){
		ex.printStackTrace();
		JOptionPane.showMessageDialog(this, "ERROR al guardar en la base de datos.",
				"ERROR", JOptionPane.ERROR_MESSAGE);
	}
}

public static void main(String[] args) {
	new AgregarPalabraGUI();
}

}