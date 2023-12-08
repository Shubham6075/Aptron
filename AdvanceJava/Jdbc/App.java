package advance_Java.JDBC.InsertQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
	public static void main(String[] args){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptron","root","root1234");
			System.out.println("Database Connected.....");
			String query = "create table student1(sid int primary key, name varchar(50), language varchar(50))";
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("Table created......");

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
