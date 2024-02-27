package structural.bridge;

public interface DataSource {

    void insertData(String data);

    String retrieveData(int id);
}
