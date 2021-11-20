package ru.zsa.departments;

public class Department {
    int id;
    String name;
    long expenses;
    String activity;
    int counttrains;
    int countemployees;

    public Department(int id, String name, long expenses, String activity, int counttrains, int countemployees) {
        this.id = id;
        this.name = name;
        this.expenses = expenses;
        this.activity = activity;
        this.counttrains = counttrains;
        this.countemployees = countemployees;
    }

    public void status(){

    }
}
