package pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainPokemon {
	public static void main(String[] args) {

		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("Conexión establecida");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
