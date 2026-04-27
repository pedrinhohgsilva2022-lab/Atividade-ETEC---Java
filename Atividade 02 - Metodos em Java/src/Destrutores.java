public class Destrutores {
    protected void finalize() { //O uso de finalize é raro
        System.out.println("Objeto está sendo removido pelo Gargabe Collector");
    }

    static void main(String[] args) {
        Destrutores exemplo = new Destrutores();
        exemplo = null; // Torna o objeto disponivel para exclusão
        System.gc();
    }
}
