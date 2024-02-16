package structural.flyweight;

public class JdbcService implements Service {

    public JdbcService(){
        System.out.println("Creating new JdbcService instance...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getData() {
        System.out.println("Retrieving data from JDBCDataSource...");
        return "Retrieved some data via JDBC";
    }

    @Override
    public void insertData(String data) {
        System.out.println("Inserting data via JDBCDataSource");
    }
}
