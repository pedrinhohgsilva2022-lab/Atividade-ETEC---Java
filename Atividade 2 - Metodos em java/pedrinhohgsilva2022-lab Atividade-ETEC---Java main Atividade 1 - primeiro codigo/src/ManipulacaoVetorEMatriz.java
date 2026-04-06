public class ManipulacaoVetorEMatriz {
    static void main(String[] args) {
        int[] IdadeAlunos = new int[10];
        float[][] NotasAlunos = new float[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com a idade do " + (i+1) + "º aluno: ");
            IdadeAlunos[i] = new java.util.Scanner(System.in).nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com a nota da AV" + (j + 1) + " do " + (i + 1) + "º aluno: ");
                NotasAlunos[i][j] = new java.util.Scanner(System.in).nextFloat();
            }
        }
    }
}
