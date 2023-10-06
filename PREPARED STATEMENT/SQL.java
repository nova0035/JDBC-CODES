import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class SQL {
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/test";
			String user = "root";
			String password = "";

			Connection conn = DriverManager.getConnection(url,user,password);

			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO demo VALUES (?,?)");

			String reply = "";
			int srno;
			String name;

			Scanner scan = new Scanner(System.in);

			while(!reply.equals("n")){

				System.out.print("\nEnter SRNO : ");
				srno = scan.nextInt();

				System.out.print("Enter Name : ");
				name = scan.next();

				pstmt.setInt(1,srno);
				pstmt.setString(2,name);

				int rep = pstmt.executeUpdate();

				if(rep == 1){
					System.out.println("\nValue Inserted Successfully");
				}

				else{
					System.out.println("\nValue Cannot Be Inseted");
				}

				System.out.print("Wanna Enter Next Values (Y/n) : ");
				reply = scan.next();

				if(!reply.toLowerCase().equals("y")){
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();			
		}
	}
}
