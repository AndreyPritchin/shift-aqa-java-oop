public class Transformer {
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

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void fire() {
        System.out.println(this.name + " is firing");
    }

    public void charge() {
        System.out.println(this.name + " is charging");
    }
}