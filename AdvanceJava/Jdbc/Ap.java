package advance_Java.JDBC.InsertQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Ap {
	public static void main(String[] args){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron","root","root1234");
			System.out.println("Database Connected.....");

			String query = "insert into student values(?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 104);

			ps.setString(2, "Naman");

			ps.executeUpdate();

			System.out.println("Record Inserted");

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
