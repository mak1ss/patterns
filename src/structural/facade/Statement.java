package structural.facade;

import com.sun.security.jgss.GSSUtil;

public class Statement {
    private Connection connection;
    public Statement(Connection connection){
     this.connection = connection;
    }
    public boolean execute(String query){
        System.out.println("Executing statement...");
        connection.provideQuery(query);
        return true;
    }
}
