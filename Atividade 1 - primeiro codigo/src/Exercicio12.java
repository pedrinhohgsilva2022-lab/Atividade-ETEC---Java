public class Exercicio12 {
    static void main(String[] args) {
        System.out.print("Me informe um numero inteiro para calcular seu fatorial: ");
        int num = new java.util.Scanner(System.in).nextInt();

        int fatorial = 1;

        for (int i = num; i >= 1; i--) { //"i--" é responsavel pelo decremento, determina se aumenta ou diminui a repetição, ou seja, ordem crescente ou descrescente.//
            fatorial = fatorial * i; //a variavel "fatorial" acumula o resultado a cada vez que num é multiplica por um numero anterior digitado pelo usuario, foi isso que entendi pelo menos.//
        }

        System.out.print("Fatorial: " + fatorial);
    }
}