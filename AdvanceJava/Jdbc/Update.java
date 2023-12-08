package advance_Java.JDBC.UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron","root","root1234");
			System.out.println("Database Connected......");

			System.out.print("Enter the student id to update : ");
			int studentIdToUpdate = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter updated student name : ");
			String updatedStudentName = scanner.nextLine();

			// sql update query
			String query = "Update student SET name = ? Where sid = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, updatedStudentName);
			ps.setInt(2, studentIdToUpdate);

			int rowsUpdated = ps.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Record with student ID " + studentIdToUpdate + " updated successfully.");
			} else {
				System.out.println("No records found for student ID " + studentIdToUpdate + ". No records updated.");
			}

			con.close(); // Close the database connection
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
