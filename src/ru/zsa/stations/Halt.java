package ru.zsa.stations;

public class Halt extends Stations{

    public Halt(int id, String name, String type, String dateBuild) {
        super(id, name, type, dateBuild);
    }

    @Override
    public void repair(int sum, int time) {
        System.out.println("Ремонт касс");
    }

    @Override
    public void reform(int sum, int time) {
        System.out.println("Строительство вокзала");
    }
}
