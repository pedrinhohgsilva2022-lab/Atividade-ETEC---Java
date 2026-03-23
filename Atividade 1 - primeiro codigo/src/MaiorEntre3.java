public class MaiorEntre3 {
    public static void main(String[] args) {
        System.out.println("Digite um valor para x: ");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digite um valor para y: ");
        int y = new java.util.Scanner(System.in).nextInt();

        System.out.println("Digite um valor para z: ");
        int z = new java.util.Scanner(System.in).nextInt();

        if(x > y && x > z) {
            System.out.println("O maior numero é " + x);
        }

        else {
            if (y > x && y > z) {
                System.out.println("O maior numero é " + y);
            }

            else {
                System.out.println("O maior numero é " + z);
            }
        }
    }
}
