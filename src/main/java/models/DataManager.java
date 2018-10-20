package models;

public class DataManager {
	
	protected String dbHost;
	protected String dbUser;
	protected String dbPass;
	protected String dbName;
	protected String driver;
	protected String connUrl;

	public DataManager() {
		dbHost = "localhost";
		dbUser = "root";
		dbPass = "";
		dbName = "";
		driver = "com.microsoft.sqlserver.mssql-jdbc.Driver";
		connUrl = "";
	}
	
}
