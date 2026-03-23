public class Exercicio9 {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite um valor para o lado 1 do triangulo: ");
        double x = sc.nextDouble();
        System.out.print("Digite um valor para o lado 2 do triangulo: ");
        double y = sc.nextDouble();
        System.out.print("Digite um valor para o lado 3 do triangulo: ");
        double z = sc.nextDouble();

        if (x == y && x == z) { // && significa AND, ou seja, todos precisam ser verdadeiro para o resultado ser verdadeiro//
            System.out.print("Seu triangulo é equilatero.");
        }
        else {
            if (x == y || x == z || y == z) { //tabela verdade (aprendi em python), OR/||: Se um dos elementos for verdadeiro, o resultado final será verdadeiro, depende do resultado de apenas um elemento//
                System.out.print("Seu triangulo é isósceles.");
            }
            else {
                System.out.print("Seu triangulo é escaleno");
            }
        }
    }
}
