package ru.zsa.exception;

public class DontTransfer extends RuntimeException{
    public DontTransfer (){
        super("Не подходящий груз");
    }
}
