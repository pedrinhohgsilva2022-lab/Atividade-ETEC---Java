public class WhileCombinadoComIf {
    public static void main(String [] args) {
        boolean impar = false; //Boolean: tipo de vriavel que armazena apenas true e false, diferente do INT, que armazena apenas numeros inteiros.
        while (impar == false) {
            System.out.println("Digite um valor para X: ");
            int x = new java.util.Scanner(System.in).nextInt();

            if(x % 2 == 0) {
                System.out.println("A incognita X é par!");
            }

            else {
                impar = true;
                System.out.println("A incognita X é impar!");
                System.out.println("Seu programa será encerrado.2");
            }
        }
    }
}
