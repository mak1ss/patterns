package structural.facade;

public class CrudServiceFacade {

    private final String CONNECTION_URL = "url:3306";

    public boolean insertData(Object data){
        Connection connection = new Connection(CONNECTION_URL, "MySQL5Dialect");
        String query = "INSERT INTO TABLE(data) VALUES " + data.toString();
        Statement statement = new Statement(connection);
        return statement.execute(query);
    }
}
