public class ParOuImpar {
    public static void main(String[] args) {
        System.out.println("Digite um valor para X: ");

        int x = new java.util.Scanner(System.in).nextInt();
        if (x % 2 == 0) {
            System.out.println("O valor de X é um numero Par!");
        }

        else {
            System.out.println("O valor de X é um numero impar!");
        }
    }
}
