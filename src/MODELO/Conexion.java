package MODELO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {


	

	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/parcial_cartera","root","");
			if (conexion != null) {
				System.out.println("Conexion a base de datos inventario listo");
			}
		} catch (SQLException e) {
			System.out.println(e.toString()+" Error 1");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString()+" error 2");
		}
	}

	


}
