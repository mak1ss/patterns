package structural;

import structural.adapter.EurUSCar;
import structural.adapter.EurUSDriver;
import structural.adapter.EuropeanCar;
import structural.bridge.DAO;
import structural.bridge.JdbcDataSource;
import structural.bridge.JpaDataSource;
import structural.composite.General;
import structural.composite.Soldier;
import structural.decorator.BigSausageHotDog;
import structural.decorator.CheeseHotDog;
import structural.decorator.HotDog;
import structural.decorator.PlainHotDot;
import structural.facade.CrudServiceFacade;
import structural.flyweight.*;
import structural.proxy.DataSource;
import structural.proxy.DataSourceProxy;


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
            Service service = flyweightFactory.getFlyweightService(ServiceType.jdbc);
            service.insertData("inserting new data");

            service = flyweightFactory.getFlyweightService(ServiceType.hibernate);
            service.getData();
        }

        System.out.println("------------ Flyweight End ------------");
        System.out.println("------------ Proxy Start ------------");
        DataSource eager = new structural.proxy.JpaDataSource();
        eager.getData();

        DataSource lazy = new DataSourceProxy();
        lazy.getData();
        System.out.println("------------ Proxy End ------------");

        System.out.println("------------ Composite Start ------------");

        General general = new General(new Soldier[]{ new Soldier("Петро"), new Soldier("Вася")});
        general.completeMission("Захопити сарай");

        General internationalGeneral = new General(new Soldier[] {new Soldier("Jack"), new Soldier("William")});
        general.addChild(internationalGeneral);

        general.completeMission("Capture the barn");
        System.out.println("------------ Composite End ------------");

        System.out.println("------------ Bridge Start ------------");

        DAO dao = new DAO(new JdbcDataSource());

        dao.createUser("Mike");
        dao.createUser("Dave");
        System.out.println(dao.getUser(2));

        dao = new DAO(new JpaDataSource());

        dao.createUser("max");
        System.out.println(dao.getUser(1));

        System.out.println("------------ Bridge End ------------");
    }
}
