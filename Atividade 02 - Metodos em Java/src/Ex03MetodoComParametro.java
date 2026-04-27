public class Ex03MetodoComParametro {
    public void ident (String nome, int idade) {
        System.out.println("Seu nome é " + nome);
        System.out.println("E você possui " + idade + " anos.");
    }

    static void main(String[] args) {
        Ex03MetodoComParametro info = new Ex03MetodoComParametro();
        info.ident("Pedro", 16);
    }
}
