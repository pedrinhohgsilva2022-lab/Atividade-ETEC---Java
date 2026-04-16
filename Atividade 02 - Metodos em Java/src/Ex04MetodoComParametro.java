public class Ex04MetodoComParametro {
    public void numero (int num) {
        if (num > 0) {
            System.out.println("Esse numero, " + num + ", é positvo.");
        }else {
            System.out.println("Esse numero, " + num + ", é negativo.");
        }
    }

    static void main(String[] args) {
        Ex04MetodoComParametro positivoOrNegativo = new Ex04MetodoComParametro();
        positivoOrNegativo.numero(50);
    }
}
