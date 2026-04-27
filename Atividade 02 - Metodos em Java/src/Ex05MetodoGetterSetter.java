public class Ex05MetodoGetterSetter {
    private String titularConta;
    public void setTitularConta (String titular) {
        this.titularConta = titular;
    }

    public String getTitularConta() { return titularConta;}

    //=================

    private double saldoBancario;
    public void setSaldoBancario(double saldo) { this.saldoBancario = saldo;}

    public double getSaldo() { return saldoBancario;}


    static void main(String[] args) {
        Ex05MetodoGetterSetter ContaBancaria= new Ex05MetodoGetterSetter();
        ContaBancaria.setSaldoBancario(0.02);
        ContaBancaria.setTitularConta("Daniel Fonseca");

        System.out.println("Olá, " + ContaBancaria.getTitularConta() + ". Seu saldo bancario é de " + ContaBancaria.getSaldo());
    }
}
