public class Ex04MetodoStatic {
    public void repita (String text) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(text);
        }
    }

    static void main(String[] args) {
        Ex04MetodoStatic repetição = new Ex04MetodoStatic();
        repetição.repita("Se está rodando, pra que testar?");
    }
}
