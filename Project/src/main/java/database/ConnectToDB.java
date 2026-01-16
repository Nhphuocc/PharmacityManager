package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {
	private static Connection con = null;
	private static final String url = "jdbc:sqlserver://";
	private static final String servername = "HPHUOC\\HP";
	private static final String port = "1433";
	private static final String databasename = "pharmacy_management";
	private static final String user = "sa";
	private static final String password = "123456789";
	public static String getConectUrl() {
		return url + servername + ":" + port + ";"
				+ "databaseName=" + databasename + ";"
				+ "user=" + user + ";"
				+ "password=" + password + ";";
	}
	
	public static Connection getConn(){
		try {
			con = DriverManager.getConnection(
					ConnectToDB.getConectUrl()
					);
		} catch (Exception e) {
			con = null;
			e.printStackTrace();
		}
		return con;
	}
}
