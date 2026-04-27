public class Ex05MetodoStatic {
    static boolean numPar (int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static void main(String[] args) {
        System.out.println(numPar(110));
    }
}
