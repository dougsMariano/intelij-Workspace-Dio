import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;

        for (int i = 1; i <= N; i++) {

            if (i == N) System.out.println(anterior);

            else System.out.print(anterior + " ");

            proximo = anterior + atual;

            atual += anterior;

            anterior = atual-anterior;

        }
    }
}
