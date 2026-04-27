public class Ex02MetodoStatic {
    static void soma() {
        System.out.println("Digite um primeiro valor: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite o segundo valor: ");
        int z = new java.util.Scanner(System.in).nextInt();

        int resul = x + z;

        System.out.println("Resultado final: " + resul);
    }

    static void main(String[] args) { //exibe
        Ex02MetodoStatic.soma();
    }
}
