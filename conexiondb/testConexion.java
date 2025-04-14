package conexiondb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class testConexion {
public static void main(String[] args)  {
	Conexion c = new Conexion();
	if(c.conexion!=null) {
		System.out.println("Conexión establecida");
	}else {System.out.println("ERROR DE CONEXIÓN");}
 String consulta= "select codigo,nombre,precio from productos";
 Scanner sc = new Scanner(System.in);
 String nombre;
 String insercion ="insert into productos(codigo,nombre,precio) values(default,?,?)";
 int precio;
 PreparedStatement ps;
 ResultSet rs;
 while(true) {
 try {
	 ps= c.conexion.prepareStatement(consulta);
     rs = ps.executeQuery();
     while(rs.next()) {
    	 System.out.println(rs.getString("nombre") + " : ");
    	 System.out.println(rs.getInt("precio"));
     }
 
	 System.out.println("CARGAR DATOS");
	
	   System.out.println("ingrese Nombre : ");
	   nombre = sc.next(); 
	   System.out.println("ingrese Precio : ");
	   precio = sc.nextInt();
	  
	 
	 ps = c.conexion.prepareStatement(insercion);
	 ps.setString(1,nombre);
	 ps.setInt(2,precio);
	 ps.executeUpdate();

	//c.conexion.close();
	 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }//final del mientras
}
}
