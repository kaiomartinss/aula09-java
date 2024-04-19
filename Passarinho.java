public class Passarinho extends Animal implements Voar{
    public Passarinho(String nome, TipoAnimal t) {
        super(nome, t);
    }

    @Override
    public void emitirSom() {
        System.out.println("PIU PIU");
    }

    @Override
    public void voar() {

    }

    @Override
    public String toString() {
        return "Passarinho{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
