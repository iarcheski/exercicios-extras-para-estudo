public class MediaAritmetica {
    public static void main(String[] args) {
        int nota1 = 8, nota2 = 9, nota3 = 7, nota4 = 4, nota5 = 5, nota6 = 6;

        int soma1 = (nota1 + nota2 + nota3);
        int resultado1 = soma1 / 3;
        System.out.println("A soma das notas 8, 9 e 7 é: " +soma1 + " e a média aritmética é: " + resultado1);

        int soma2 = (nota4 + nota5 + nota6);
        int resultado2 = soma2 / 3;
        System.out.println("A soma das notas 4, 5 e 6 é: " +soma2 + " e a média aritmética é: " + resultado2);

        float somaDuasMedias = resultado1 + resultado2;
        float mediaDasMedias = somaDuasMedias / 2;
        System.out.println("A soma das duas médias é: " + somaDuasMedias + " e a média das duas médias é: " + mediaDasMedias);
    }
}