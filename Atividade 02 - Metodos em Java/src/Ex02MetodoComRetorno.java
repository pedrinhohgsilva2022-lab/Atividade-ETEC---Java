public class Ex02MetodoComRetorno {
    public String nomeCompleto() {
        return "Pedro Henrique Gomes";
    }

    static void main(String[] args) {
        Ex02MetodoComRetorno nome = new Ex02MetodoComRetorno();
        System.out.println("Seu nome é " + nome.nomeCompleto() + ".");
    }
}
