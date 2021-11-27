package ru.zsa.trains;

public abstract class Trains{
    int id;
    String type;
    int force;
    String date;

    public Trains(int id, String type, int force, String date) {
        this.id = id;
        this.type = type;
        this.force = force;
        this.date = date;
    }

    public void work() {
    }
}
