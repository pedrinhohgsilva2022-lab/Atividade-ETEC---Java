public class SobrecargaExemplo {
    public void exibir(int x) {
        System.out.println("Valor inteiro: " + x);
    }

    public void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void exibir(int x, String texto) {
        System.out.println("Valor: " + x + " - Texto: " + texto);
    }

    public static void main(String[] args) {
        SobrecargaExemplo sobrecarga = new SobrecargaExemplo();

        sobrecarga.exibir(7);
        sobrecarga.exibir("Java");
        sobrecarga.exibir(7, "Java");
    }
}
