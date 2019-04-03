import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LearnToConnectToSnowflake {
    public static void main(String args[]) {
        try {
            Class.forName("net.snowflake.client.jdbc.SnowflakeDriver");
            Connection con = DriverManager.getConnection("jdbc:snowflake://tubemogul.snowflakecomputing.com/?warehouse=DAILY_SNOWFLAKE&db=DEMO_DB&schema=STEWARD", "XXX", "XXX");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "eraser69trek1427");

            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select \n" +
                    "    sum(auction_count) as auction_count,\n" +
                    "    sum(bid_count) as bid_count,\n" +
                    "    sum(win_count) as win_count\n" +
                    "from feed_performance_by_hostname_hourly\n" +
                    "where logdate = '2019-02-14';");
            while (resultSet.next())
                System.out.println(resultSet.getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
