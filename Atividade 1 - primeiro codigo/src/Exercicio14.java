public class Exercicio14 {
    static void main(String[] args) {
        int numprimos = 0;

        for (int n = 1; n <= 1000; n++) {
            int divisor = 0;

            for (int i = 1; i <= n; i++) {
                if (n%i == 0) {
                    divisor++;
                }

            }
            if (divisor == 2) {
                numprimos++;
            }
        }
        System.out.println("Quantidade de números primos é de " + numprimos);
    }
}
