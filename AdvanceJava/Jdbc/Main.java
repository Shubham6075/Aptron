package advance_Java.JDBC;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/aptron";
		String username = "root";
		String password = "root1234";

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			if (connection != null) {
				System.out.println("Connection established.");

				// Create a Statement for executing SQL queries
				Statement statement = connection.createStatement();

				// Define your SQL query to retrieve data from the 'customerInfo' table
				String query = "SELECT * FROM customerInfo";

				// Execute the query and store the results in a ResultSet
				ResultSet resultSet = statement.executeQuery(query);

				// Iterate through the ResultSet and print the data
				while (resultSet.next()) {
					int customerId = resultSet.getInt("cid");
					String customerName = resultSet.getString("cName");
					String department = resultSet.getString("dept");
					int salary = resultSet.getInt("salary");

					System.out.println("Customer ID: " + customerId);
					System.out.println("Customer Name: " + customerName);
					System.out.println("Department: " + department);
					System.out.println("Salary: " + salary);
					System.out.println("----------");
				}

				// Close resources when done
				resultSet.close();
				statement.close();
				connection.close();
			} else {
				System.err.println("Connection failed.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
