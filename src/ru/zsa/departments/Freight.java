package ru.zsa.departments;

public class Freight extends Department{

    public Freight(int id, String name, long expenses, String activity, int counttrains, int countemployees) {
        super(id, name, expenses, activity, counttrains, countemployees);
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
