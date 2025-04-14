package varios;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class JuegoBasico extends JPanel {
private int x =50, y =50;// posición de la pelota
private int dx =2, dy =2;// velocidad

public JuegoBasico() {
	//timer para actualizar la animación
	Timer timer = new Timer(10, new ActionListener() {
		
	public void actionPerformed(ActionEvent e) {
		x += dx;
		y += dy;
		//Rebotar en los bordes
		if(x < 0 || x > getWidth()-30) dx *= -1;
		if(y < 0 || y > getHeight()-30) dy *= -1;
		
		repaint();// redibujar la pantalla
	}
	});
	timer.start();
}
protected void paintComponent(Graphics g) {
	//super.paintComponent(g);
	g.setColor(Color.RED);
	g.fillOval(x, y, 30, 30);// dibujar la pelita
}
public static void main(String[] args) {
	JFrame ventana = new JFrame("Juego en Java");
	JuegoBasico juego = new JuegoBasico();
	
	ventana.add(juego);
	ventana.setSize(400, 300);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventana.setVisible(true);
}
}
