public class Ex03MetodoSobrecarregado {
    public void exibir (String text) {
        System.out.println(text);
    }
    public void exibir(String text, int vezes) {
        for (int i = 1; i <= vezes; i++)
            System.out.println(text);
    }

    static void main(String[] args) {
        Ex03MetodoSobrecarregado sobrecarga = new Ex03MetodoSobrecarregado();

        sobrecarga.exibir("Reflita!!");
        sobrecarga.exibir("Enquanto você procura o bug no código, a vida roda sem debug. Reflita!!", 10);
    }
}
