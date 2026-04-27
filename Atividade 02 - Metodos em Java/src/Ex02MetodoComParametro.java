public class Ex02MetodoComParametro {
    public void soma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("O resultado da sua soma é " + resultado);
    }

    static void main(String[] args) {
        Ex02MetodoComParametro obj = new Ex02MetodoComParametro();
        obj.soma(30, 37);
    }
}