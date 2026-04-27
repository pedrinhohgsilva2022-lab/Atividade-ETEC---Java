public class Ex01MetodoGetterSetter { //Deixei o nome original do arquivo como class para poder me localizar melhor na hora da entrega da tarefa.
        private String nome;
        public void setNome(String nome) {
        this.nome = nome;
    } //setter

        public String getNome() { return nome;}

        //=================

        private int idade;
        public void setIdade(int idade) { this.idade = idade;}

        public int getIdade() { return idade;}


        static void main(String[] args) {
            Ex01MetodoGetterSetter pessoa = new Ex01MetodoGetterSetter();
            pessoa.setNome("Pedro");
            pessoa.setIdade(16);

            System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        }
}
