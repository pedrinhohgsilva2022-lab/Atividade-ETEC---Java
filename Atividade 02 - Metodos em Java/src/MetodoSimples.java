public class MetodoSimples {
    public void imprimirNome(String nome) {
        System.out.println("Nome recebido: " + nome);
    }
    public static void main(String[] args) {
        MetodoSimples imp = new MetodoSimples();
        imp.imprimirNome("Pedro");
    }
}