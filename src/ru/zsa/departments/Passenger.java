package ru.zsa.departments;

public class Passenger extends Department{

    public Passenger(int idd, String name, long expenses, String activity, int counttrains, int countemployees) {
        super(idd, name, expenses, activity, counttrains, countemployees);
    }

    @Override
    public void repair(int sum, int time) {

    }

    @Override
    public void upgr(int sum, int time) {

    }

    @Override
    public void reform(int sum, int time) {

    }
}
