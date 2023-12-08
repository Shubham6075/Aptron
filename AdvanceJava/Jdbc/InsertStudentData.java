package advance_Java.JDBC.InsertQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudentData {     // adding data using scanner class
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron", "root", "root1234");
			System.out.println("Database Connected.....");

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter student ID: ");
			int studentId = scanner.nextInt();

			scanner.nextLine(); // Consume the newline character

			System.out.print("Enter student name: ");
			String studentName = scanner.nextLine();

			String query = "INSERT INTO student (sid, name) VALUES (?, ?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, studentId);
			ps.setString(2, studentName);

			ps.executeUpdate();

			System.out.println("Record Inserted");

			con.close(); // Close the database connection

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
