public class Ex01MetodoComRetorno {
    public int anoAtual() {
        return 2026;
    }

    static void main(String[] args) {
        Ex01MetodoComRetorno ano = new Ex01MetodoComRetorno();
        System.out.println("Estamos no ano de " + ano.anoAtual() + ".");
    }
}
