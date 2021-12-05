package ru.zsa.employees;

import ru.zsa.exception.DontPension;

public abstract class Employees {
    int id;
    String firstName;
    String lastName;
    String dateEmployment;
    int age;
    char sex;
    String position;
    int counthours;

    public Employees(int id, String firstName, String lastName, String dateEmployment, int age, char sex, String position, int counthours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateEmployment = dateEmployment;
        this.age = age;
        this.sex = sex;
        this.position = position;
        this.counthours = counthours;
    }

    public void work(){

    }
    public void vacation(){

    }
    public void pension(){
        if ((age > 59 && sex == 'F') || (age > 64 && sex == 'M')) {
            System.out.println("Пора на заслуженнный отдых");
        }else {
            throw new DontPension();
        }

    }
}
