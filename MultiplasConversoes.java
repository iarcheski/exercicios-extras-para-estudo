import java.util.Scanner;

public class MultiplasConversoes {
    public static void main(String[] args) {

        double resultado;
        int opcao;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção ");
        System.out.println("-------------");
        System.out.println("Opção 1: somar");
        System.out.println("Opção 2: dividir");
        System.out.println("Opção 3: sair");
        System.out.println("-------------");

        do {
            System.out.println("Digite o número da opção escolhida: ");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("A opção 1 é a soma e vou lhe ajudar nesse calculo");
                    System.out.println("Digite o primeiro número que deseja somar:");
                    double primeiroNumero = ler.nextDouble();
                    System.out.println("Digite o segundo número que deseja somar:");
                    double segundoNumero = ler.nextDouble();
                    resultado = primeiroNumero + segundoNumero;
                    System.out.println("A soma entre os dois números informado é: " + resultado);
                    break;

                case 2:
                    System.out.println("Vi que você quer fazer uma divisão, então vamos lá!");
                    System.out.println("Informe o primeiro número que deseja fazer a divisão:");
                    primeiroNumero = ler.nextDouble();
                    System.out.println("Agora nos informe o segundo número e lhe daremos o resultado");
                    segundoNumero = ler.nextDouble();
                    resultado = primeiroNumero / segundoNumero;
                    System.out.println("A divisão  desses dois números é: " + resultado);
                    break;

                case 3:
                    System.out.println("Se sua decisão é essa, tudo bem, até a próxima!");
                    break;

                default:
                    System.out.println("A opção escolhida é inválida, escolha um dos três números sugeridos");
                    break;
            }
        } while(opcao != 3);
    }
}
