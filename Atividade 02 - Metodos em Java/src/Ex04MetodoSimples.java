public class Ex04MetodoSimples {
    public void exibirNome(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
    public static void main(String[] args) {
        Ex04MetodoSimples imp = new Ex04MetodoSimples();
        imp.exibirNome(1);
    }
}