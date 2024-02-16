package structural.proxy;

import java.util.Date;

public class DataSourceProxy implements DataSource {

    private DataSource dataSource;

    @Override
    public void getData() {
        if(dataSource == null){
            System.out.println(new Date() + ": Lazy initializing of class structural.proxy.JpaDataSource.class");
            dataSource = new JpaDataSource();
        }
        System.out.println(new Date() + ": Invoking method getData() of class structural.proxy.JpaDataSource.class");
        dataSource.getData();
    }
}
