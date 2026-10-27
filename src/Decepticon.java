public class Decepticon extends Transformer implements Action {
    private String teamName;
    private final String eyeColor = "red";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    @Override
    public void transform() {
        System.out.println(getName() + " transforming into a surface transport");
        System.out.println(getName() + " transforming into an air transport");
        System.out.println(getName() + " transforming into a weapon");
        System.out.println(getName() + " transforming into equipment");
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