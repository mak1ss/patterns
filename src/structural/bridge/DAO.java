package structural.bridge;

public class DAO {

    private DataSource dataSource;

    public DAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createUser(String name){
        dataSource.insertData("User : " + name);
    }

    public String getUser(int id){
        String res;
        try{
            res = dataSource.retrieveData(id - 1);
        } catch(IndexOutOfBoundsException ex){
            throw new IllegalArgumentException("Index " + id + " is not present in the data base");
        }
        return res;
    }
}
