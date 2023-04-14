package one.positivosemediadigitalinovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x;
        double soma = 0;


        for(int i = 1; i <= 6; i++){
            x = leitor.nextDouble();
            if(x > 0){
                cont++;
                soma += x;
            }
        }

        media = soma / cont;
        System.out.println(cont + " Valores positivos");
        System.out.println(String.format("%.1f", media));

    }

}

