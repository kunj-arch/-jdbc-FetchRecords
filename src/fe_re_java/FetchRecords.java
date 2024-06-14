package fe_re_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aghor","root","KUNJ@$#@!");
		
		con.setAutoCommit(false);
		
		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user445 values(1234,'kunj',60000)");
		stmt.addBatch("insert into user445 values(191,'umesh',70000)");
		
		stmt.executeBatch();
		
		con.commit();
		con.close();
				
	}

}
