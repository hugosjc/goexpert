package br.com.especialista.java.estruturaDeControleseOperadores.desafios;

import java.util.Scanner;

public class AnoBisexto {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        boolean anoBisexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.printf("Bissexto: %b%n", anoBisexto);
    }
}
