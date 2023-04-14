import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);
        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();

            if(poderDeLuta <= 800){
                System.out.println("Inseto");
            } else if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            }

        }
    }
}
