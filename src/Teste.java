import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {
	
	public static void main(String[] args) {
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&useTimezone=true&serverTimezone=UTC","root","8625251@Ra");
			System.out.println("Foi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
