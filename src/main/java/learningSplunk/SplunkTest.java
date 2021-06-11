package learningSplunk;

import com.splunk.*;

public class SplunkTest {
    public static void main(String[] args) {

        // Create a map of arguments and add login parameters
        ServiceArgs loginArgs = new ServiceArgs();
        loginArgs.setUsername("");
        loginArgs.setPassword("");
        loginArgs.setHost("splunk-us.corp.adobe.com");
        loginArgs.setPort(8089);

        // Create a Service instance and log in with the argument map
        Service service = Service.connect(loginArgs);


        // A second way to create a new Service object and log in
        // Service service = new Service("localhost", 8089);
        // service.login("admin", "yourpassword");

        // A third way to create a new Service object and log in
        // Service service = new Service(loginArgs);
        // service.login();

        // Print installed apps to the console to verify login
        for (Application app : service.getApplications().values()) {
            System.out.println(app.getName());
        }
    }
}
