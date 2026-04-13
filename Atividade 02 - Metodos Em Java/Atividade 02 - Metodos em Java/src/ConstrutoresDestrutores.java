public class ConstrutoresDestrutores {
    String nome;

    public ConstrutoresDestrutores(String nome) {
        this.nome = nome;
    }

    public void exibirAluno() {
        System.out.println("Aluno: " + nome);
    }

    static void main(String[] args) {
        ConstrutoresDestrutores aluno = new ConstrutoresDestrutores("Pedro");
        aluno.exibirAluno();
    }
}
