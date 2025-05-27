package edu.estatuas.intercepting.filters;

public class Autorization implements Filter{

    @Override
    public void execute(String username){
        System.out.println("Realizando autorización... OK");
    }
}
