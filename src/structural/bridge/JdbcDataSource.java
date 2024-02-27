package structural.bridge;

public class JdbcDataSource extends AbstractDataSource{
    @Override
    public void insertData(String data) {
        System.out.println("Inserting data via JdbcDataSource..");
        super.db.add(data);
    }

    @Override
    public String retrieveData(int id) {
        System.out.println("Retrieving data via JdbcDataSource..");
        return super.db.get(id);
    }
}
