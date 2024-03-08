import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para verificar se ele pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        if (numero == primeiro || numero == segundo) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        while (segundo <= numero) {
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            if (numero == proximo) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                return;
            }
        }

        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    }
}
