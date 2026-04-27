public class Ex05MetodoSobrecarregado {
    public void exibir(char c) {
        System.out.println("Caractere: " + c);
    }
    public void exibir(String text) {
        System.out.println("Texto: " + text);
    }

    static void main(String[] args) {
        Ex05MetodoSobrecarregado sobrecarga = new Ex05MetodoSobrecarregado();

        sobrecarga.exibir('#');
        sobrecarga.exibir("Python melhor que Java?");
    }
}
