package ru.zsa;

import ru.zsa.departments.*;

public class Main {

    public static void main(String[] args) {
        Department department1 = new Department(1, "Passenger Transportation", 10000000, "Transportation");
        Department department2 = new Department(2, "Freight Transportation", 30000000, "Transportation");

        Employees employee1 = new Employees(1, "Ivan", "Ivanov", "28.03.2001", "18.07.1990", "Driver");
        Employees employee2 = new Employees(2, "Anna", "Pupkina", "14.10.2012", "27.01.1988", "Cashier");

        Roads road1 = new Roads(1, "Moscow", 1165);
        Roads road2 = new Roads(2, "Novosibirsk", 1548);

        Stations station1 = new Stations(1, "Novosibirsk", "Railway Station", "23.06.1905");
        Stations station2 = new Stations(2, "67 km", "Halt", "11.09.1974");

        Trains train1 = new Trains(1, "Electric locomotive", 6600, "07.02.2018");
        Trains train2 = new Trains(2, "Locomotive", 1200, "03.05.2006");

        department1.status();
        department2.status();

        employee1.work();
        employee2.vacation();

        road1.work();
        road2.repair();

        station1.repair();
        station2.work();

        train1.work();
        train2.repair();

    }
}
