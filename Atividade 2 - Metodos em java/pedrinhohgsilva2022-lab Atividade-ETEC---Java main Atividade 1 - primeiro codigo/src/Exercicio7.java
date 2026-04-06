public class Exercicio7 {
    static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        int x = sc.nextInt();
        System.out.print("Digite um valor para Y: ");
        int y = sc.nextInt();

        if (x > y) {
            System.out.print("O maior valor é " + x);
        }
        else {
            if (y > x) {
                System.out.print("O maior valor é " + y);
            }

            else {
                System.out.print("Ambos valores são iguais.");
            }
        }
    }
}
