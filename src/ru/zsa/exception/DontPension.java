package ru.zsa.exception;

public class DontPension extends RuntimeException{
    public DontPension (){
        super("Ты слишком молод, нужно еще поработать");
    }
}
