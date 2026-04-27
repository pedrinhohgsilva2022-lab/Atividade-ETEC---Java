public class Ex02MetodoComRetornoEParametro {
    public static String mensagemPersonalizada(String nome) {
        return "Olá, " + nome + "!!!";
    }

    public static void main(String[] args) {
        String fim = mensagemPersonalizada("Pedro");
        System.out.println(fim);
    }
}