import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        // Adicionando as temperaturas na lista:
        int count = 0;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Digite a temperatura: ");

            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");

        // Exibindo todas as temperaturas
        System.out.println(temperaturas);
        temperaturas.forEach(t -> System.out.print(t + " "));

        // Calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        // Exibindo as temperaturas acima da média:
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        // Exibindo o mês das temperaturas acima da media por extenso:
        System.out.println("\n\nMeses das temperaturas acima da media: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while(iterator.hasNext()) {
            Double temp = iterator.next();
            if(temp > media) {
                switch (count){
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - Março: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - Abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - Maio: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - Junho: %.1f\n ", temp);
                        break;
                    default:
                        System.out.println("Não ouve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
