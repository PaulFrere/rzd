package ru.zsa.trains;

import ru.zsa.exception.DontTransfer;

public abstract class Trains{
    int id;
    String type;
    int force;
    String date;
    String typeCargo;

    public Trains(int id, String type, int force, String date, String typeCargo) {
        this.id = id;
        this.type = type;
        this.force = force;
        this.date = date;
        this.typeCargo = typeCargo;
    }

    public void work() {
    }
    public void transfer(){
        if((type.equals("Freight") && typeCargo.equals("Freight")) || (type.equals("Passenger") && typeCargo.equals("Passenger"))){
            System.out.println("Поехали!");
        }else {
            throw new DontTransfer();
        }
    }
}
