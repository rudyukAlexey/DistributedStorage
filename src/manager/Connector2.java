package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

public class Connector2 {
	   public static Connection CreateConnection() throws NamingException, SQLException, ClassNotFoundException{
	        //try {
	            Class.forName("com.mysql.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3307/database";
	            String name = "root";
	            String password = "";
	                Connection connection = DriverManager.getConnection(url, name, password);
	                Statement statement = connection.createStatement();
	                return connection;
	    }
	}