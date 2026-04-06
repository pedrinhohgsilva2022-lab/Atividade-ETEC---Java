public class Exercicio8 {
    static void main(String[] args) {
        double maior;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        double x = sc.nextDouble();
        System.out.print("Digite um valor para Y: ");
        double y = sc.nextDouble();

        maior = (x > y ? x : y);

        System.out.print("O maior valor entre eles é " + maior);

    }
}
