package ru.zsa.employees;

public class Driver extends Employees{

    int countkm;

    public Driver(int id, String firstName, String lastName, String dateEmployment, String dateBorn, String position, int counthours, int countkm) {
        super(id, firstName, lastName, dateEmployment, dateBorn, position, counthours);
        this.countkm = countkm;
    }
    public void route(){

    }
}
