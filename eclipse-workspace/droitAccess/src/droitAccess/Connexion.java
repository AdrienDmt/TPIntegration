package droitAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAO.DroitAccesDao;

public class Connexion {
	
	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddjavaorm?autoReconnect=true&useSSL=false",
                "root", "")) {
			DroitAccesDao dao = new DroitAccesDao(connection);
			dao.desactiverAnciensUtilisateurs();
			
		}catch (SQLException e){
			e.printStackTrace();
			
		}
	}

}