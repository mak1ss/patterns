package structural.proxy;

public class JpaDataSource implements DataSource {

    public JpaDataSource(){
        System.out.println("Initializing data source...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getData() {
        System.out.println("Retrieving data from database...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
