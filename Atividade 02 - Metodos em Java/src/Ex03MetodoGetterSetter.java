public class Ex03MetodoGetterSetter {
    private String autorNome;
    public void setAutor(String nome) {
        this.autorNome = nome;
    } //setter

    public String getAutor() { return autorNome;}

    //=================

    private String titulo;
    public void setTitulo(String titulo) { this.titulo = titulo;}

    public String getTitulo() { return titulo;}


    static void main(String[] args) {
        Ex03MetodoGetterSetter livro = new Ex03MetodoGetterSetter();
        livro.setAutor("Antonio Prata");
        livro.setTitulo("Nu, de botas");

        System.out.println("Autor do livro: " +livro.getAutor());
        System.out.println("Titulo do livro: " + livro.getTitulo());
    }
}
