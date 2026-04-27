public class Ex01MetodoComRetornoEParametro {
    public double multiplicaçãoNum (double a, double b) {
        return a * b;
    }

    static void main(String[] args) {
        Ex01MetodoComRetornoEParametro calc = new Ex01MetodoComRetornoEParametro();
        double resultado = calc.multiplicaçãoNum(15,20);
        System.out.println("Resultado da sua multiplicação: " + resultado);
    }
}
