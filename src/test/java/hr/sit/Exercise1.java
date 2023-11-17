package hr.sit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Exercise1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		String query = "Select * from hr.employees where job_id = 'IT_Prog';";
		String userName = "Sediqi1";
		String password = "12345678";
		String url = "https://hr-sit.noortecktraining.com/employee/one";
		
		
		Class.forName("com.mysql.cj.jdbc.driver");
		
		Connection conn = DriverManager.getConnection(userName,password ,url);
		
		
		Statement stm = (Statement) conn.createStatement();
		
		
		 ResultSet rs = ((java.sql.Statement) stm).executeQuery(query);
		 
		 
		 while (rs.next()) {
				System.out.println(rs.getString("employee_id"));
				System.out.println(rs.getString("first_name"));
				System.out.println(rs.getString("last_name"));
				System.out.println(rs.getString("job_id"));
				System.out.println(rs.getString("Salary"));
				
				System.out.println("***************************");
				
			}
		
	}

}
