public class Ex03MetodoComRetornoEParametro {
    public int dobroNum (int num) {
        return num + num;
    }

    static void main(String[] args) {
        Ex03MetodoComRetornoEParametro calc = new Ex03MetodoComRetornoEParametro();
        int resultado = calc.dobroNum(45);
        System.out.println("Resultado: " + resultado);

    }
}
