public class CardapioComSwitchECase {
    public static void main(String[] args) {
        System.out.println("Olá, amigão, tudo certo?! O que vamos comer hoje?");
        System.out.println("1 - Opções de pratos.");
        System.out.println("2 - Opções de bebidas.");
        System.out.println("3 - Encerrar minha conta.");
        System.out.println("Lembre-se: Digite apenas o numero da opção que desejar.");
        int opcao = new java.util.Scanner(System.in).nextInt();

        switch (opcao) {
            case 1:{
                System.out.println("Nas opções de pratos, temos: ");
                System.out.println("* Hamburguer");
                System.out.println("* Pizza a moda da casa");
                System.out.println("* Batata frita");
                break;
            }

            case 2:{
                System.out.println("Em bebidas, temos: ");
                System.out.println("* Agua");
                System.out.println("* Refrigerante");
                System.out.println("* Cerveja sem alcool");
                break;
            }

            case 3:{
                System.out.println("Operação finalizada.");
                break;
            }

            default:{
                System.out.println("Opção invalida. Tente novamente!");
            }
        }
    }
}
