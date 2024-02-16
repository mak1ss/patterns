package structural;

import structural.adapter.EurUSCar;
import structural.adapter.EurUSDriver;
import structural.adapter.EuropeanCar;
import structural.decorator.BigSausageHotDog;
import structural.decorator.CheeseHotDog;
import structural.decorator.HotDog;
import structural.decorator.PlainHotDot;
import structural.facade.CrudServiceFacade;
import structural.flyweight.FlyweightSourceFactory;
import structural.flyweight.HibernateService;
import structural.flyweight.JdbcService;
import structural.flyweight.Service;
import structural.proxy.DataSource;
import structural.proxy.DataSourceProxy;
import structural.proxy.JpaDataSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------ Adapter Start ------------");

        EuropeanCar eurCar = new EuropeanCar();
        EurUSDriver adapter = new EurUSCar(eurCar);

        adapter.addEuropeanLuggage(35.90);
        adapter.addUSLuggage(35.90);

        adapter.travelDistanceInEurope(90);
        adapter.travelDistanceInUS(90);

        System.out.println(adapter.getEuropeanLuggage() + " kilograms");
        System.out.println(adapter.getUSLuggage() + " pounds");
        System.out.println(adapter.getEuropeanDistance() + " kilometers");
        System.out.println(adapter.getUSDistance() + " miles");
        System.out.println("------------ Adapter End ------------");

        System.out.println("------------ Decorator Start ------------");

        HotDog hotDog = new PlainHotDot();
        hotDog.describe();
        System.out.println();

        hotDog = new CheeseHotDog(hotDog);
        hotDog.describe();
        System.out.println();

        hotDog = new BigSausageHotDog(hotDog);
        hotDog.describe();
        System.out.println();

        System.out.println("------------ Decorator End ------------");

        System.out.println("------------ Facade Start ------------");

        CrudServiceFacade facade = new CrudServiceFacade();

        facade.insertData("test case");

        System.out.println("------------ Facade End ------------");

        System.out.println("------------ Flyweight Start ------------");

        FlyweightSourceFactory flyweightFactory = FlyweightSourceFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            Service service = flyweightFactory.getFlyweightService(JdbcService.class);
            service.insertData("inserting new data");

            service = flyweightFactory.getFlyweightService(HibernateService.class);
            service.getData();
        }

        System.out.println("------------ Flyweight End ------------");
        System.out.println("------------ Proxy Start ------------");
        DataSource eager = new JpaDataSource();
        eager.getData();

        DataSource lazy = new DataSourceProxy();
        lazy.getData();
        System.out.println("------------ Proxy End ------------");

    }
}
