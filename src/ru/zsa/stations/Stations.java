package ru.zsa.stations;

import ru.zsa.intefaces.Upgrade;

public abstract class Stations implements Upgrade {
    int id;
    String name;
    String type;
    String dateBuild;

    public Stations(int id, String name, String type, String dateBuild) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dateBuild = dateBuild;
    }

    @Override
    public void upgr(int sum, int time) {
        System.out.println("Установка автоматов для продажи билетов");
    }
}
