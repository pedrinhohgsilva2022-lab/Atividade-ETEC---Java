public class Ex01MetodoComParametro {
    public void imprimirMensagem (String mensagem) {
        System.out.println("Para criar um arquivo java, use " + mensagem + " no final!");
    }

    static void main(String[] args) {
        Ex01MetodoComParametro mens = new Ex01MetodoComParametro();
        mens.imprimirMensagem(".html");
    }
}
