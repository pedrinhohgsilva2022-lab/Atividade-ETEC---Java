public class Entre1e1000 {
    public static void main(String [] args) {
        System.out.println("Escreva um valor para X: ");
        int x = new java.util.Scanner(System.in).nextInt();

        if (x >= 1 && x <= 1000){
            System.out.println("O seu numero está entre 1 e 1000!");
        }

        else {
            System.out.println("O seu numero não está entre 1 e 1000!");
        }
    }
}
