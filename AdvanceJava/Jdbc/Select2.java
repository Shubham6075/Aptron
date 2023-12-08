package advance_Java.JDBC.SelectQuery;

import java.sql.*;
import java.util.Scanner;

public class Select2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron", "root", "root1234");
			System.out.println("Connection Created...");

			String query = "Select * from student where sid = ?";

			PreparedStatement ps = con.prepareStatement(query);

			System.out.print("Enter the Student id :");
			int sid = scanner.nextInt();

			ps.setInt(1,sid);

			ResultSet rst = ps.executeQuery();

			if(rst.next()){
				int v1 = rst.getInt(1);
				String v2 = rst.getString(2);

				System.out.println("Student id : " +v1);
				System.out.println("Student name : " +v2);
			}else{
				System.out.println("Record not found....");
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
