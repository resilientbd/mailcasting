
import javax.servlet.*;
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		
		Connection con=null;
	try{
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bnlivein_lict","bnlivein_lict","java@1234");

		
		PreparedStatement ps=con.prepareStatement("CREATE TABLE IF NOT EXISTS MAILCASTINGUSER(EMAIL TEXT,PASSWORD TEXT,NAME TEXT,GENDER TEXT,MNAME TEXT, COUNTRY TEXT)");
		ps.executeUpdate();
		PreparedStatement ps4=con.prepareStatement("CREATE TABLE INBOX6(ID INT,RECIEVER TEXT,SENDER TEXT,MESSAGE TEXT,DATE_OF_RECEIVING TEXT)");
		ps4.executeUpdate();		
		
		}	
	
		
	    catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	    }
	    
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
