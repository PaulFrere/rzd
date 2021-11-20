package ru.zsa.employees;

public class Employees {
    int id;
    String firstName;
    String lastName;
    String dateEmployment;
    String dateBorn;
    String position;
    int counthours;

    public Employees(int id, String firstName, String lastName, String dateEmployment, String dateBorn, String position, int counthours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateEmployment = dateEmployment;
        this.dateBorn = dateBorn;
        this.position = position;
        this.counthours = counthours;
    }

    public void work(){

    }
    public void vacation(){

    }
}
