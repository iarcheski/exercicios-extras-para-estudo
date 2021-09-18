import java.util.Scanner;

public class LerIdadeEmDias {
    public static void main(String[] args) {
        int ano = 365;
        int mes = 30;

        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva a sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Quantos meses: ");
        int meses = ler.nextInt();
        System.out.print("Quantos dias: ");
        int dias = ler.nextInt();

        int idadeEmDias = (idade * ano) + (meses * mes) + dias;
        System.out.println("Sua idade em dias é: " + idadeEmDias);


    }
}
