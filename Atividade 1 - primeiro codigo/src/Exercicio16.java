public class Exercicio16 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o tamanho da sua matriz: ");
        int num = sc.nextInt();

        int[][] matriz = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Os numeros da diagonal são: ");
        for (int i = 0; i < num; i++) {
            System.out.print(matriz[i][num - 1 - i] + " "); //Só inverter os valores nessa ultima parte//
        }
        }
    }