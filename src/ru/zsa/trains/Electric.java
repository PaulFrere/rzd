package ru.zsa.trains;

import ru.zsa.intefaces.Upgrade;

public class Electric extends Trains implements Upgrade {
    public Electric(int id, String type, int force, String date) {
        super(id, type, force, date);
    }

    @Override
    public void repair(int sum, int time) {
        System.out.println("Идет ремонт электровоза");
    }

    @Override
    public void upgr(int sum, int time) {
        System.out.println("Идет замена системы электропитания");
    }

    @Override
    public void reform(int sum, int time) {
        System.out.println("Замена на другую модель с меньшим энергопотреблением");
    }
}
