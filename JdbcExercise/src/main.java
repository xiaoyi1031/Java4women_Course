import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class main {

	public static void main(String[] args) {
		
		try {
			//establish connection
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world",
					"root","lexicon");  //establish connection
			
			//create queries to database
			Statement stmt = conn.createStatement(); 
			stmt.executeUpdate("insert into city (name, countrycode, population)" 
			+ "values('Java4women','SWE',20 )");
			//return result set by execute
			ResultSet rs = stmt.executeQuery("select * from city where name = 'Java4women'");
			
			while(rs.next()){
				System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", "+ rs.getString("countrycode")+ ": " + rs.getInt("population"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
