public class Ex02MetodoSobrecarregado {

    public void exibir(double lado2, double lado1) {
        System.out.println("Altura do retangulo: " + lado2 + "cm");
        System.out.println("Largura do retangulo: " + lado1 + "cm");
    }

    public void exibirArea(double lado1, double lado2) {
        double resul = lado1 * lado2;
        System.out.println("Area total: " + resul + " metros quadrados");
    }
}

void main(String[] args) {
    Ex02MetodoSobrecarregado sobrecarga = new Ex02MetodoSobrecarregado();

    sobrecarga.exibir(70.5, 22.7);
    sobrecarga.exibirArea(70.5,22.7);
}
