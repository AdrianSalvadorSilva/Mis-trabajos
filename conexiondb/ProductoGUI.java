package conexiondb;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ProductoGUI extends JFrame {
private JTextField nameField;
private JTextField priceField;
private JTable table;
private DefaultTableModel model;

@SuppressWarnings("unchecked")
public <model> ProductoGUI() {
	setTitle("Gestión de Productos");
	setSize(500,400);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	JPanel formPanel = new JPanel();
	formPanel.setLayout(new FlowLayout());
	formPanel.add(new JLabel("Nombre: "));
    nameField = new JTextField(10);
	formPanel.add(nameField);
	formPanel.add(new JLabel("Precio: "));
	priceField = new JTextField(5);
	formPanel.add(priceField);
	JButton addButton =new JButton("Agregar ");
	formPanel.add(addButton);
	add(formPanel, BorderLayout.NORTH);
	
	model = new DefaultTableModel(new String[]{"Código",
			"Nombre","Precio"},0);
	table = new JTable( model);
	add(new JScrollPane(table), BorderLayout.CENTER);
	
	cargarProductos();
	addButton.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			agregarProducto();
		}
	});
   }


private void cargarProductos() {
		Conexion c = new Conexion();
		Statement stmt = null;
		try {
			stmt = c.conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("SELECT * FROM productos");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.setRowCount(0);
		try {
			while(rs.next()) {
				model.addRow(new Object[] {rs.getInt("codigo"),
						rs.getString("nombre"), rs.getDouble("precio")});
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	private void agregarProducto() {
		String nombre = nameField.getText();
		String precio = priceField.getText();
		if(nombre.isEmpty() || precio.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Todo los campos"  
		              + "son obligatorios.", "ERROR",
					  JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
		Conexion c = new Conexion();
		PreparedStatement stmt;
		
			stmt = c.conexion.prepareStatement("insert "
					+ "into productos (nombre, precio) value (?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.setString(1, nombre);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.setDouble(2, Double.parseDouble(precio));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cargarProductos();
		nameField.setText("");
	    priceField.setText("");
	}

public static void main(String[] args) {
      new ProductoGUI().setVisible(true);	
}

}

