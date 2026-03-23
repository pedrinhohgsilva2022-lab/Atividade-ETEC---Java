//Esse codigo ler o ano pedido no começo dele e logo abaixo exclama como tempo passou rapido.

public class OlaMundoSegundaVersao {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!!");
        System.out.println("Em que ano nós estamos?");
        int ano = new java.util.Scanner(System.in).nextInt();

        System.out.println("Serio? " + ano + "?");
        System.out.println("Caramba, como tempo passa rapido, né?");

    }
}
