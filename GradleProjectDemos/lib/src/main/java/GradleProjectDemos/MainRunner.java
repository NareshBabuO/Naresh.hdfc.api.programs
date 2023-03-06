package GradleProjectDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class MainRunner {

	public static void main(String[] args) {

		try {

			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:/hdfc_db", "root", "Mysql@123");
			// Statement statement = connection.createStatement();
			java.sql.Statement createStatement = connection.createStatement();

			String string = "select dno,dname,location from department";

			ResultSet resultSet = createStatement.executeQuery(string);

			while (resultSet.next()) {

				System.out.println(resultSet.getInt("dno") + " " + resultSet.getString("dname") + " "
						+ resultSet.getString("location"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
