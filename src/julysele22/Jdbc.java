package julysele22;

import java.sql.*;

public class Jdbc {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456789");
		String s = "select * from employees where manager_id=101 and salary<10000";
		PreparedStatement ps = c.prepareStatement(s);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String string = rs.getString("first_name");
			System.out.println(string);
			}
		c.close();
		
	}

}
