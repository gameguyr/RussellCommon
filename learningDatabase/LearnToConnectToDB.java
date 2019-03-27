import java.sql.*;

public class LearnToConnectToDB {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "eraser69trek1427");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "eraser69trek1427");

            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from costs");
            while(resultSet.next())
                System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

