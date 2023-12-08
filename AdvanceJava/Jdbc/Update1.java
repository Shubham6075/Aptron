package advance_Java.JDBC.UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update1 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron","root","root1234");
			System.out.println("Database Connected.....");

			System.out.print("Enter the student id to update");
			int studentIdToUpdate = sc.nextInt();

			sc.nextLine();  // consume new line

			System.out.println("Enter the updated Name : ");
			String updatedName = sc.nextLine();

			// sql query
			String query = "Update student SET name = ? Where sid = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1,updatedName);
			ps.setInt(2,studentIdToUpdate);

			int rowsUpdated = ps.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Record with student ID " + studentIdToUpdate + " updated successfully.");
			} else {
				System.out.println("No records found for student ID " + studentIdToUpdate + ". No records updated.");
			}

			con.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
