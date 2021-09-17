public class Caneta {

        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;

        void status(){
                System.out.println("O modelo é " + this.modelo);
                System.out.println("Uma caneta " + this.cor);
                System.out.println("A ponta é " + this.ponta);
                System.out.println("Sua carga é " + this.carga);
                System.out.println("Está tampada: " + this.tampada);
        }

        void rabiscar(){
                if (this.tampada == true) {
                        System.out.println("ERRO - não posso rabiscar");
                } else {
                        System.out.println("Estou rabiscando");
                }

        }
        void tampar(){
                this.tampada = true;

        }
        void destampar(){
                this.tampada = false;
        }
    }