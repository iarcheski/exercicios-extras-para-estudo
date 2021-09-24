import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número o qual deseja saber a tabuada: ");
        int numero = ler.nextInt();

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(numero + " x " + contador + " : " + contador*numero);
        }
    }
}
