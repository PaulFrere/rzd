package ru.zsa;

import ru.zsa.departments.*;
import ru.zsa.employees.Cashier;
import ru.zsa.employees.Driver;
import ru.zsa.roads.Roads;
import ru.zsa.stations.Halt;
import ru.zsa.stations.Station;
import ru.zsa.trains.Electric;
import ru.zsa.trains.Locomotive;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger(1, "Passenger Transportation", 10000000, "Transportation", 80, 6);
        Freight freight = new Freight(1, "Freight Transportation", 30000000, "Transportation", 140, 7);

        Driver driver = new Driver(1, "Ivan", "Ivanov", "28.03.2001", "18.07.1990", "Driver", 75, 1425);
        Cashier cashier = new Cashier(1, "Anna", "Pupkina", "14.10.2012", "27.01.1988", "Cashier", 60);

        Roads road1 = new Roads(1, "Moscow", 1165);
        Roads road2 = new Roads(1, "Novosibirsk", 1548);

        Station station = new Station(1, "Novosibirsk", "Railway Station", "23.06.1905");
        Halt halt = new Halt(1, "67 km", "Halt", "11.09.1974");

        Electric electric = new Electric(1, "Electric locomotive", 6600, "07.02.2018");
        Locomotive locomotive = new Locomotive(1, "Locomotive", 1200, "03.05.2006");

        passenger.status();
        freight.status();

        driver.route();
        cashier.vacation();

        road1.work();
        road2.repair();

        station.repair();
        halt.work();

        electric.work();
        locomotive.refueling();

    }
}
