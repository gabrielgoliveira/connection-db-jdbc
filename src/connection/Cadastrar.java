package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastrar {
	public void create() {
		Connection con = ConnectionDB.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("insert into pessoa (nome, idade) values (?, ?)");
			stmt.setString(1, "Gabriel Oliveira");
			stmt.setInt(2, 18);
			stmt.executeUpdate();
			System.out.println("Um Sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
