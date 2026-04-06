public class EstruturaCombinadoIf {
    static void main(String[] args) {
        int numprimos = 0;
        for (int i = 2; i <= 50; i++) {
            System.out.println(i + " é primo?");
            int numeroDivisores = 0;
            int j = 1;
            while (j <= i){
                if(i % j == 0) {
                    numeroDivisores++;
                }
                j++;
            }
            if (numeroDivisores == 2){
                numprimos++;
                System.out.println("... sim!!");
            }
            else {
                System.out.println("... não!");
            }
        }
        System.out.println(" "); //espaço entre as linhas hahahhahah
        System.out.println("Quantidade de numeros primos: " + numprimos);
    }
}
