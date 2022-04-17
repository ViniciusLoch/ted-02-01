import java.util.Scanner;
import java.util.Random;

public class ted0201 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        System.out.println(numeroAleatorio);

        int numeroAcerto;
        int tentativas = 1;

        System.out.println("Coloque um número de 1 a 10: ");

        numeroAcerto = scan.nextInt();


        while (numeroAcerto != numeroAleatorio) {

            if (numeroAcerto > numeroAleatorio) {
                System.out.println("Errou!!! Coloque um número menor.");
                numeroAcerto = scan.nextInt();
                tentativas++;
            }
            else if (numeroAcerto < numeroAleatorio) {
                System.out.println("Errou!!! Coloque um número maior.");
                numeroAcerto = scan.nextInt();
                tentativas++;
            }
        }

        if (numeroAcerto == numeroAleatorio) {

            System.out.println("Ok!!! Você acertou. O número: " + numeroAleatorio + " em: " + tentativas + " tentativas.");

        }

        System.out.println("Tentativas: " + tentativas);
    }

}
