import java.sql.*;

public class DemoClass {
	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://sql12.freemysqlhosting.net/sql12373822";
		String username="sql12373822";
		String password="HWDHdTwcgF";
		String query="SELECT * FROM Doctor; ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("Name");
		System.out.println(name);
		st.close();
		con.close();
	}
}
