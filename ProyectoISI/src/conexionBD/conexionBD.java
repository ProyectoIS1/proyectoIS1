package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionBD 
{
	
	private Connection conexion = null;
	ResultSet resultado;
	Statement setencia;
	
	void conexion() throws SQLException {
		try {
				
				Class.forName("org.postgresql.Driver");
				String url = "jdbc:postgresql://localhost:5432/postgres";
				conexion = DriverManager.getConnection(url,"postgres","12345678");
				
				if(conexion != null) 
				{
					System.out.println("Conexion base de datoss ... ok");
				}
			} 
		catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
	}

	void siguiente(){
		try {
			String id = resultado.getString("id_user");
			String nombre = resultado.getString("nomb_user");
			String arreglo [] = {id,nombre};
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void mostrar(){
		try {
			conexion();
			setencia = conexion.createStatement();
			resultado = setencia.executeQuery("SELECT * FROM usuarios");
			siguiente();
		} catch (Exception e) {
		}
	}
}

