package edu.estatuas.intercepting.filters;

public class Authentication implements Filter{

    @Override
    public void execute(String username) {
        System.out.println("Realizando autenticación de " + username + "... OK");
    }
}
