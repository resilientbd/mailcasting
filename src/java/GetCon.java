import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class GetCon {
private GetCon(){}

public static Connection con;
static{
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bnlivein_lict","bnlivein_lict","java@1234");
} catch (Exception e) {
		
		e.printStackTrace();
	} 
	
}
public static Connection getCon(){
	return con;
}
}
