public class Exercicio13 {
    static void main(String[] args) { //atalho psvma.
        int resultado = 1;

        System.out.print("Digite um valor x inteiro: ");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.print("Digite um valor y inteiro: ");
        int y = new java.util.Scanner(System.in).nextInt();

        for (int i = y; i >= 1; i--) {
            resultado = resultado * x;
        }
        System.out.print("O resultado é " + resultado);
    }
}
