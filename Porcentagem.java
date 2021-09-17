import java.util.Scanner;
public class Porcentagem {
    public static void main(String[] arg) {
        double numero1;
        double numero2;
        float porcentagem;
        double resultado;
        double soma;

        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        numero1 = ler.nextDouble();

        System.out.print("Escreva o segundo número: ");
        numero2 = ler.nextDouble();

        soma = numero1 + numero2;
        System.out.println("o valor total é de: " + soma);

        System.out.print("Escreva a porcentagem: ");
        porcentagem = (float) ler.nextDouble() / 100;

        resultado = soma - (porcentagem * soma );
        System.out.print("O resultado é: " + resultado);

    }

}
