public class Aula02 {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();

        Caneta caneta2 = new Caneta();
        caneta2.cor = "Preta";
        caneta2.modelo = "Bic";
        caneta2.tampar();
        caneta2.rabiscar();
        caneta2.status();
    }
}
