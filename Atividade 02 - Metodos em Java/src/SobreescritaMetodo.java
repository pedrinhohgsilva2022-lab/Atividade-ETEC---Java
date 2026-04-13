class animal {
    public void fazerSons () {
        System.out.println("O cachorro faz som! ");
    }
}

class cachorro extends animal {
    @Override
    public void fazerSons() {
        System.out.println("Au Au!!");
    }
}

public class SobreescritaMetodo {
    static void main(String[] args) {
        animal Animal = new animal();
        animal cachorro = new cachorro();

        Animal.fazerSons();
        cachorro.fazerSons();
    }
}