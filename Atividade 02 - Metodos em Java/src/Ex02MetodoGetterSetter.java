public class Ex02MetodoGetterSetter {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    } //setter

    public String getNome() { return nome;}

    //=================

    private double preco;
    public void setPreco(double preco) { this.preco = preco;}

    public double getPreco() { return preco;}


    static void main(String[] args) {
        Ex02MetodoGetterSetter produto = new Ex02MetodoGetterSetter();
        produto.setNome("Café pilão 500g");
        produto.setPreco(24.99);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}
