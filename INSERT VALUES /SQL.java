import java.io.*;
import java.sql.*;

public class SQL {
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/test";
			String user = "root";
			String password = "";

			Connection conn = DriverManager.getConnection(url,user,password);

			System.out.println("Connection Successfully");

			Statement stmt = conn.createStatement();

			stmt.execute("CREATE TABLE demo (srno int(3), name varchar(20))");

			int a = stmt.executeUpdate("INSERT INTO demo VALUES (1,'demo1')");

			System.out.println("VALUE INSERTED SUCCESSFULLY" + a);
		}
		catch(Exception e){
			e.printStackTrace();			
		}
	}
}
