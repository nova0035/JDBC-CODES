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
		}
		catch(Exception e){
			e.printStackTrace();			
		}
	}
}
