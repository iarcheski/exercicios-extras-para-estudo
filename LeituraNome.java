import java.util.Scanner;

public class LeituraNome {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = ler.nextLine();

        System.out.println("Olá " +nome);

    }
}
