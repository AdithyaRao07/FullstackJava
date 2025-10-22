/*
 Java Database Connectivity
1.import the package
2.Load and register the Driver
3.Create Connection
4.Create Statement
5. Execute the query
6.Process the details
7.Close
 */
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/school";
        String name="root";
        String pwd="12345";
        String username="Faraz";
        String query="insert into students values(?,?)";
        int id=5;
     //Class.forName("com.mysql.jdbc.Driver"); depricated
     Connection con=DriverManager.getConnection(url,name,pwd);
    // Statement stmnt=con.createStatement();
    // int count=stmnt.executeUpdate("insert into students values("+ id +",'"+username+ "')");
      //  System.out.println( count+"  row/s affected");
        //stmnt.close();
        //let's try to use prepared statement to make it easy when we want to insert multiple  values easily
        PreparedStatement ps=con.prepareStatement(query);//we need to give query in statement creation step
        ps.setInt(1,6);
        ps.setString(2,"Geetha");
        ps.setInt(1,7);
        ps.setString(2,"Devi");
        int count=ps.executeUpdate();
        System.out.println(count+" row/s affected");
        ps.close();
        con.close();
    }
}
