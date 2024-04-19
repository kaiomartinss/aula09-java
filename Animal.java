public abstract class Animal {
    protected String nome;
    private final TipoAnimal t;

    public Animal(String nome, TipoAnimal t) {
        this.nome = nome;
        this.t = t;
    }

    public TipoAnimal getT() {
        return t;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
}
