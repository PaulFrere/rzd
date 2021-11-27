package ru.zsa.stations;

public class Station extends Stations{

    public Station(int id, String name, String type, String dateBuild) {
        super(id, name, type, dateBuild);
    }
    public void recreationRoom(){
        System.out.println("Добавление нового подразделения");
    }

    @Override
    public void repair(int sum, int time) {
        System.out.println("Ремонт вокзала");
    }


    @Override
    public void reform(int sum, int time) {
        System.out.println("Изменение руководящего состава");
    }
}
