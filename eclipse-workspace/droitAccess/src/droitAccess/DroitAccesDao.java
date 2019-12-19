package droitAccess;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DroitAccesDao {

	private static final String DESACTIVE_ANCIENS_UTILISATEURS = "UPDATE Utilisateur set actif = false where YEAR(current_date) - YEAR(dateInscription) > 10 ;";

	private Connection connection;
	
	public DroitAccesDao(Connection connection) {
		this.connection = connection;
	}


	public void desactiverAnciensUtilisateurs() {
		
		
		try(Statement stmt = connection.createStatement()) {
			
			stmt.executeUpdate(DESACTIVE_ANCIENS_UTILISATEURS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}