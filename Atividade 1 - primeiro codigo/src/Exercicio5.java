public class Exercicio5 {
    static void main(String[] args) {
        System.out.println("Digite a velocidade do veiculo em km/h: ");
        int velocidade = new java.util.Scanner(System.in).nextInt();
        System.out.println("Por ultimo, me informe o tempo da viagem em horas.");
        int temp = new java.util.Scanner(System.in).nextInt();

        System.out.println("Com o tempo de viagem sendo " + temp + " horas e a velocidade media de " + velocidade + ", posso concluir que você percorreu " + velocidade*temp + " km.");
    }
}
