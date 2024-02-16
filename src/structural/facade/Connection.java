package structural.facade;

import java.lang.reflect.Executable;

public class Connection {


    public Connection(String connectionUrl, String sqlDialect){
        System.out.println("Connecting to " + connectionUrl);
        System.out.println("Using " + sqlDialect + " dialect");
    }

    public void provideQuery(String query){
        System.out.println("Executing query ... " + query);
    }
}
