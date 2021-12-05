package ru.zsa.trains;

import ru.zsa.intefaces.Upgrade;

public class Locomotive extends Trains implements Upgrade {
    public Locomotive(int id, String type, int force, String date, String typeCargo) {
        super(id, type, force, date, typeCargo);
    }

    public void refueling(){

    }


    @Override
    public void repair(int sum, int time) {
        System.out.println("Идет ремонт тепловоза");
    }

    @Override
    public void upgr(int sum, int time) {
        System.out.println("Идет замена деталей двигателя");
    }

    @Override
    public void reform(int sum, int time) {
        System.out.println("Замена на другую модель с меньшим расходом топлива");
    }
}
