package CreationalPattern.ObjectPoolPattern;

import java.util.ArrayList;

public class DBConnectionPoolManager {
	
	private ArrayList<DBConnection> freeList = new ArrayList<>();
	private ArrayList<DBConnection> inUse = new ArrayList<>();
	private static final int MAX_CAP = 6;
	private static final int INITIAL_CAP = 3;
	private static DBConnectionPoolManager dbPoolManager;
	
	DBConnectionPoolManager(){
		for(int i = 0 ; i < INITIAL_CAP ; i++) freeList.add(new DBConnection());
	}
	
	public static DBConnectionPoolManager getInstance() {
		if(dbPoolManager == null) {
			synchronized(DBConnectionPoolManager.class) {
				if(dbPoolManager == null) {
					dbPoolManager = new DBConnectionPoolManager();
				}
			}
		}
		return dbPoolManager;
	}
	
	public synchronized DBConnection getConnection() {
		if(freeList.isEmpty() && inUse.size() < MAX_CAP) {
			freeList.add(new DBConnection());
		}
		else if(freeList.isEmpty() && inUse.size() >= MAX_CAP) {
			System.out.println("ALL Connections are in use please wait");
			return null;
		}
		DBConnection connection = freeList.remove(freeList.size()-1);
		inUse.add(connection);
		return connection;
	}
	
	public synchronized void releaseConnection(DBConnection connection) {
		if(connection != null) {
			inUse.remove(connection);
			freeList.add(connection);
			System.out.println("DB connection realeased");
		}
	}
}
