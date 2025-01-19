package DesignPatterns.CreationalPattern.ObjectPoolPattern;

public class Main {

	public static void main(String[] args) {
		
		DBConnectionPoolManager pool = DBConnectionPoolManager.getInstance();
		DBConnection con1 = pool.getConnection();
		DBConnection con2 = pool.getConnection();
		DBConnection con3 = pool.getConnection();
		DBConnection con4 = pool.getConnection();
		DBConnection con5 = pool.getConnection();
		DBConnection con6 = pool.getConnection();
		pool.getConnection();
		pool.releaseConnection(con6);
	}

}
