package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new DBTest();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DBTest() throws SQLException {
		Connection conn = DriverManager
				.getConnection("jdbc:ucanaccess://C:\\Users\\Clemens\\git\\Java_Intro\\MyFirstGUI\\db\\dbtest1.accdb;memory=false");
		//pfad kann zuhause anders sein
		Statement stmt = conn.createStatement();
		stmt.execute("INSERT INTO address ( vorname, nachname, ort, plz )"
				+ "VALUES ('clemens2', 'thalhammer', 'wien', 1190)");

	}
}