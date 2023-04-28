package br.com.dio.collection.set;

/*
Crie um conjunto contendo as cores do arco-íres e:
a) Exiba todas as cores do arco-íres uma abaixo da outra;
b) A quantidade de Cores que o arco-íres tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi imformada;
e) Exiba todas as cores que começam com a letra "v";
f) Remova todas as cores que não começam com a letra "v";
g) Limpe o conjunto;
 */


import java.util.*;

public class ExercicioArcoIres {

    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íres: ");
        Set<String> coresDoArcoIres = new HashSet<>();
        coresDoArcoIres.add("violeta");
        coresDoArcoIres.add("anil");
        coresDoArcoIres.add("azul");
        coresDoArcoIres.add("verde");
        coresDoArcoIres.add("amarelo");
        coresDoArcoIres.add("laranja");
        coresDoArcoIres.add("vermelho");
        System.out.println(coresDoArcoIres);
        System.out.println();

        System.out.println("Exiba todas as cores do conjunto, uma abaixo da outra: ");
        for(String cor : coresDoArcoIres) {
            System.out.println("-" + cor);
        }

        System.out.println();
        System.out.println("A arco-íres tem " + coresDoArcoIres.size() + " cores.");

        System.out.println();
        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresDoArcoIres2 = new TreeSet<>(coresDoArcoIres);
        for(String cores : coresDoArcoIres2){
            System.out.println("-" + cores);
        }

        System.out.println();
        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresDoArcoIres3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho" ));
        System.out.println(coresDoArcoIres3);
        List<String> coresDoArcoIresList = new ArrayList<>(coresDoArcoIres3);
        Collections.reverse(coresDoArcoIresList);
        System.out.println(coresDoArcoIresList);

        System.out.println();
        System.out.println("Exiba as cores que começam com 'v': ");
        for(String coresV : coresDoArcoIres){
            if(coresV.startsWith("v")) {
                System.out.println("-" + coresV);
            }
        }

        System.out.println();
        System.out.println("Remova todas as cores que não começam com a letra 'v': ");
        Iterator<String> iterator = coresDoArcoIres.iterator();
        while(iterator.hasNext()) {
            if(!iterator.next().startsWith("v")) {
                iterator.remove();
            }
        }
        System.out.println("-" + coresDoArcoIres);

        System.out.println();
        System.out.println("limpe o conjunto: ");
        coresDoArcoIres.clear();

        System.out.println();
        System.out.println("O conjunto está vazio? " + coresDoArcoIres.isEmpty());
    }
}
