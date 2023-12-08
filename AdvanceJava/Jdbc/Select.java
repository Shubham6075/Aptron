package advance_Java.JDBC.SelectQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron", "root", "root1234");
			System.out.println("Connection Created...");

			String query = "Select * from student";

			Statement st = con.createStatement();

			ResultSet rst = st.executeQuery(query);

			rst.next();
			rst.next();
			rst.next();

			int v1 = rst.getInt(1);
			String v2 = rst.getString(2);

			System.out.println(v1 + " " + v2);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
