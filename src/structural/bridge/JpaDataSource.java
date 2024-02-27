package structural.bridge;

public class JpaDataSource extends AbstractDataSource {
    @Override
    public void insertData(String data) {
        System.out.println("Inserting data via JpaDataSource..");
        super.db.add(data);
    }

    @Override
    public String retrieveData(int id) {
        System.out.println("Retrieving data via JpaDataSource..");
        return super.db.get(id);
    }
}
