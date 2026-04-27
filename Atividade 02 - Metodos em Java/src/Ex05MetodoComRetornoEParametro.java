public class Ex05MetodoComRetornoEParametro {
    public boolean maiorIdade (int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Ex05MetodoComRetornoEParametro calc = new Ex05MetodoComRetornoEParametro();
        boolean resul = calc.maiorIdade(18);
        System.out.println(resul);
    }
}
