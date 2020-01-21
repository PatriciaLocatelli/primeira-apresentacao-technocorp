package diferencaClasseObjeto;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João Carlos", "Rua A, 555", "559995647");
        Pessoa p2 = new Pessoa("Maria Fernanda", "Rua B, 157", "54872145");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
