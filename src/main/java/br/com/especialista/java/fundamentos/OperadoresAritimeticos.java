package br.com.especialista.java.fundamentos;

public class OperadoresAritimeticos {

    public static void main(String [] args) {

        int minhaIdade = 40;
        int suaIdade = 25;

        //Adicao
        int totalIdades = minhaIdade + suaIdade;
        System.out.println("Soma das idades: " + totalIdades);

        //Subtracao
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferenca das idades: " + diferencaIdades);

        //Multiplicacao
        int dobroDaIdades = 2 * suaIdade;
        System.out.println("Dobro da sua idade: " + dobroDaIdades);

        //Divisao
        int metadeDaIdades = suaIdade / 2;
        System.out.println("Metade da sua idade: " + dobroDaIdades);

        //Modulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisao (modilo): " + restoDivisao);
    }
}
