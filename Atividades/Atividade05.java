public class Atividade05 {
    public static void main(String[] args) {
        String texto = "Hello, world!";
        String textoInvertido = inverterString(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }

    static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
