package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controllers.TraduccionController;
import models.Traduccion;

public class TraductorGUI extends JFrame{
	private static final String EXIT_ON_CLOSE = null;
	private JTextField campoPalabra;
	private JButton botonBuscar;
	private JLabel etiquetaResultado;
	private TraduccionController controlador;
	public TraductorGUI() {
	//Inicializar controlador con algunas traducciones
	controlador = new TraduccionController();
	controlador.agregarTraduccion(new Traduccion(1, "hola", "hello"));
	controlador.agregarTraduccion(new Traduccion(2, "adiós", "goodvye"));
	controlador.agregarTraduccion(new Traduccion(3, "gracia", "thank you"));
    
    
    setTitle("Español-Ingles");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
		
 JLabel titulo = new JLabel("Traductor Español- ingles");
 titulo.setBounds(60, 10, 200, 25);
  add(titulo);
 
 campoPalabra = new JTextField();
 campoPalabra.setBounds(30, 50, 150, 25);
 add(campoPalabra);
 
 botonBuscar = new JButton("Buscar");
 botonBuscar.setBounds(190, 50, 80, 25);
 add(botonBuscar);
 etiquetaResultado = new JLabel("Traducción: ");
 etiquetaResultado.setBounds(30, 90, 240, 25);
 add( etiquetaResultado);
 
 //Acción del botón
 botonBuscar.addActionListener(new ActionListener(){
 @Override
 public void actionPerformed(ActionEvent e) {
	 buscarTraduccion();
 }
 });
 setVisible(true);
}
private void buscarTraduccion() {
	String palabra = campoPalabra.getText().trim().toLowerCase();
	boolean encontrado = false;
	
	for(int i=0; i <100; i++) {
		Traduccion t = controlador.consultarporId(i);
		if(t != null && t.getEspanol().equalsIgnoreCase(palabra)) {
			etiquetaResultado.setText("Traducción: " + t.getIngles());
			encontrado = true;
			break;
		}
	}
	if(!encontrado) {
		etiquetaResultado.setText("Traducción no encontrada. ");
	}
}
public static void main(String[] args) {
	new TraductorGUI();
}

}