public class Exercicio6 {
    static void main(String[] args) {
        double x1,x2,y1,y2,resultado;

        java.util.Scanner sc = new java.util.Scanner(System.in); //Define que, para guardar uma informação em uma variavel, basta declarar ela e inserir a parte "sc.next'tipo de variavel', está feito.

        System.out.print("Digite um valor para x1: ");
        x1 = sc.nextDouble();

        System.out.print("Digite um valor para y1: ");
        y1 = sc.nextDouble();

        System.out.print("Digite um valor para x2: ");
        x2 = sc.nextDouble();

        System.out.print("Digite um valor para y2: ");
        y2 = sc.nextDouble();

        resultado = Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2) ); //Ele pegara o quadrado de (x1-x2) e (y2 - y1), somará e pegara a raiz com a função "math.sqrt"//2

        System.out.printf("A distancia entre o ponto A e B é de %.2f", resultado); //%.2f foi usado para forçar, no maximo, 2 casas decimais após a virgula, para não ficar um ngc tão quebrado. Ele basicamente desconsiderou o resto da divisão, pelo que entendi


    }
}
