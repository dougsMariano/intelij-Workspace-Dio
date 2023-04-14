package br.com.dio.collection.list;

import java.text.CollationElementIterator;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
//         Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//
//        List notas = new ArrayList(); // Antes do Java 5
//        List<Double> notas = new ArrayList<>(); // Generics - Diamond Operator
//        ArrayList<Double> notas = new ArrayList<>(); // Não é muito recomendável esta forma
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//
//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // É utilizável, mas não recomendável
//        notas.add(10d); // Não é possível adicionar nem remover sem instanciar um novo objeto antes
//        System.out.println(notas); // Não imprime, pois não é possível adicionar um novo elemento

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // É utilizável, mas não recomendável
//        notas.add(1d); // Não é possível adicionar nem remover sem instanciar um novo objeto antes
//        notas.remove(5d);
//        System.out.println(notas); // Não imprime, pois não é possível adicionar e nem remover um novo elemento


        System.out.println("Crie uma lista e adicione sete notas para um aluno:");
        List<Double> notas = new ArrayList<>(); // Generics - Diamond Operator
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram adiciodas: ");
        for (Double nota : notas){
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double>  iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista está vazia? " + notas.isEmpty());

    }
}
