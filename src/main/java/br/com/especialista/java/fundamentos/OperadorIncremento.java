package br.com.especialista.java.fundamentos;

public class OperadorIncremento {

    public static void main(String [] args) {

        int limiteTentativasLogin = 10;

        //int novoLimiteTentativaLogin = limiteTentativasLogin--;
        int novoLimiteTentativaLogin = --limiteTentativasLogin;

        System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
        System.out.println("novo limite de tentativas de login: " + novoLimiteTentativaLogin);
    }
}
