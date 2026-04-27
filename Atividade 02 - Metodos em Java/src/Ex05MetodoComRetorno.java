public class Ex05MetodoComRetorno {
    public double valorPi() {
        return 3.14159;
    }

    static void main(String[] args) {
        Ex05MetodoComRetorno pi = new Ex05MetodoComRetorno();
        System.out.println("O valor de é, aproximadamente, " + pi.valorPi() + ".");
    }
}
