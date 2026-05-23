public class Autobot extends Transformer implements Action {
    public String teamName;
    private final String eyeColor = "blue";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform() {
        System.out.println(name + " transforming into a vehicle");
    }

    @Override
    public void fire(String name) {
        System.out.println(name + " is firing");
    }

    @Override
    public void charge(String name) {
        System.out.println(name + " is charging");
    }
}