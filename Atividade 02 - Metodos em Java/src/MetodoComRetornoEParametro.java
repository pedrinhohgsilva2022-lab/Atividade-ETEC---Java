public class MetodoComRetornoEParametro {
    public int multiplicar (int x, int y) {
        return x * y;
    }

    static void main(String[] args) {
        MetodoComRetornoEParametro calc = new MetodoComRetornoEParametro();
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Resultado: " + resultado);
    }
}

