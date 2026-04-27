public class Ex04MetodoComRetornoEParametro {
    public static String concatenação (String a, String b){
        return a + b;
    }

    static void main(String[] args) {
        Ex04MetodoComRetornoEParametro calc = new Ex04MetodoComRetornoEParametro();
        String fim = calc.concatenação("BOM ", "DIA!!!!");
        System.out.println(fim);
    }
}
