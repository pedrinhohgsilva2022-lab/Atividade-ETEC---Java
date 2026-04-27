public class Ex04MetodoSObrecarregado {
    public void exibirSoma(int num1, int num2) {
        int resul = num1 + num2;
        System.out.println(resul);
    }
    public void exibirSoma (int num1, int num2, int num3) {
        int resul = num1 + num2 + num3;
        System.out.println(resul);
    }
    public void exibirSoma (int num1, int num2, int num3, int num4) {
        int resul = num1 + num2 + num3 + num4;
        System.out.println(resul);
    }

    static void main(String[] args) {
        Ex04MetodoSObrecarregado sobrecarga = new Ex04MetodoSObrecarregado();
        sobrecarga.exibirSoma(23,17);
        sobrecarga.exibirSoma(10,15,20);
        sobrecarga.exibirSoma(2,4,6);
    }
}
