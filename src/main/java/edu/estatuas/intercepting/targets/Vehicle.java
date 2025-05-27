package edu.estatuas.intercepting.targets;

public class Vehicle implements Target {

    @Override
    public void execute(String username){
        System.out.println("Ye aquí su corcel, " + username + '.');
    }
}
