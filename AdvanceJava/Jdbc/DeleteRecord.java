package advance_Java.JDBC.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron", "root", "root1234");
			System.out.println("Database Connected.....");

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter student ID to delete: ");
			int studentIdToDelete = scanner.nextInt();

			// Construct the DELETE SQL query
			String deleteQuery = "DELETE FROM student WHERE sid = ?";

			PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);

			deleteStatement.setInt(1, studentIdToDelete);

			int rowsDeleted = deleteStatement.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Record with student ID " + studentIdToDelete + " deleted successfully.");
			} else {
				System.out.println("No records found for student ID " + studentIdToDelete + ". No records deleted.");
			}

			con.close(); // Close the database connection

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
