public class Decepticon extends Transformer {
    public String teamName;
    private final String eyeColor = "red";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " transforming into a surface transport");
        System.out.println(name + " transforming into an air transport");
        System.out.println(name + " transforming into a weapon");
        System.out.println(name + " transforming into equipment");
    }
}