public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor = "blue";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
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

    public boolean getKindness() {
        return this.kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(getName() + " transforming into a vehicle");
    }
}