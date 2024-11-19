import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn () {
        try {            //as mysql is an external entity so during compilation it will not give error but while runtime it may give so use try catch block to catch the exception
            //Class.forName(com.mysql.cj.jdbc.Driver);  //this is not required as we kept the jar file inside lib which automatically will pick up
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Manasminu#123456");
            s = c.createStatement();
        
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
