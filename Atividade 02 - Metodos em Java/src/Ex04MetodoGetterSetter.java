public class Ex04MetodoGetterSetter {
    private String tipo;
    public void setTipo(String tipoAnimal) {
        this.tipo = tipoAnimal;
    } //setter

    public String getTipo() { return tipo;}

    //=================

    private String som;
    public void setSom(String somAnimal) { this.som = somAnimal;}

    public String getSom() { return som;}


    static void main(String[] args) {
        Ex04MetodoGetterSetter Animais = new Ex04MetodoGetterSetter();
        Animais.setTipo("Gato");
        Animais.setSom("Miau, miau, miau!!!");

        System.out.println("Tipo de animal: " + Animais.getTipo());
        System.out.println("Som desse animal: " + Animais.getSom());
    }
}
