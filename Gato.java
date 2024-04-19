public class Gato extends Animal implements Corrida{
    public Gato(String nome, TipoAnimal t) {
        super(nome, t);
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

    @Override
    public void correr() {
        System.out.println("Gato esta correndo");

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
