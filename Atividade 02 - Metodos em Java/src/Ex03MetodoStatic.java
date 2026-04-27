public class Ex03MetodoStatic {
    public void dobro(int num) {
        System.out.println("O dobro do numero " + num + " é " + num*num);
    }

    static void main(String[] args) { //exibe
        Ex03MetodoStatic obj = new Ex03MetodoStatic();
        obj.dobro(5);
    }
}


