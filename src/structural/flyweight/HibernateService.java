package structural.flyweight;

public class HibernateService implements Service{

    public HibernateService(){
        System.out.println("Creating new HibernateService instance...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getData() {
        System.out.println("Retrieving data from HibernateDataSource...");
        return "Retrieved some data via Hibernate";
    }

    @Override
    public void insertData(String data) {
        System.out.println("Inserting data via HibernateDataSource");
    }
}
