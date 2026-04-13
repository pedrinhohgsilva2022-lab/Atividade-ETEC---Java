public class MetodoGettersSetters {
    private String nome;

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter
    public String getNome() {
        return nome;
    }

    static void main(String[] args) {
        MetodoGettersSetters pessoa = new MetodoGettersSetters();
        pessoa.setNome("Pedro");
        System.out.println("Nome: " + pessoa.getNome());
    }
}
