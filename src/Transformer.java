public abstract class Transformer {
    private String name;

    public Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void transform();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name: " + name + "}";
    }
}