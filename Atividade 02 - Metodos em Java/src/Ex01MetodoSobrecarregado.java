public class Ex01MetodoSobrecarregado {
    public void exibir(int x) {
        System.out.println("Numero inteiro: " + x);
    }
    public void exibir(double y) {
        System.out.println("Numero real: " + y);
    }

    public void exibir(int x, double y) {
        System.out.println("Num inteiro: " + x + " - Num real: " + y);
    }

    static void main(String[] args) {
        Ex01MetodoSobrecarregado sobrecarga = new Ex01MetodoSobrecarregado();

        sobrecarga.exibir(7);
        sobrecarga.exibir(3.50);
        sobrecarga.exibir(7, 3.50);
    }
}
