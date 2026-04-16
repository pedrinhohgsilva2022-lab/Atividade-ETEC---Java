public class Ex05MetodoComParametro {
    public void cumprimento (String nome) {
        System.out.println("Olá, " + nome+ "!! Como está o seu dia?!");
    }

    static void main(String[] args) {
        Ex05MetodoComParametro saudacao = new Ex05MetodoComParametro();
        saudacao.cumprimento("Pedro");
    }
}
