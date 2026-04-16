public class MetodoComParametro {
    public void imprimirNome (String nome) {
        System.out.println("Nome recebido: " + nome);
    }

    static void main(String[] args) {
        MetodoComParametro imp = new MetodoComParametro();
        imp.imprimirNome("Pedro");
    }
}
