public class Cachorro extends Animal implements Corrida {

    public Cachorro(String nome, TipoAnimal t) {
        super(nome, t);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    @Override
    public void correr() {

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
