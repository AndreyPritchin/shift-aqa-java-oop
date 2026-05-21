public class Autobot extends Transformer {
    public String teamName;
    private final String eyeColor = "blue";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " transforming into a vehicle");
    }
}