public class MetodoComRetorno {
    public String nomeAluno() {
        return "Pedro Henrique";
    }

    static void main(String[] args) {
        MetodoComRetorno aluno = new MetodoComRetorno();
        System.out.println("Nome do aluno: " + aluno.nomeAluno());
    }
}
