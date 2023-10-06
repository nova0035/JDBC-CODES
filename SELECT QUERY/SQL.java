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

			ResultSet table = stmt.executeQuery("SELECT * FROM demo");

			if(table.next()){
				do{
					System.out.println(table.getInt(1));
					System.out.println(table.getString(2));
				}while(table.next());
			}
			else{
				System.out.println("NO DATA FOUND");
			}

			System.out.println("VALUE INSERTED SUCCESSFULLY" + a);
		}
		catch(Exception e){
			e.printStackTrace();			
		}
	}
}
