public class Decepticon extends Transformer {
    public String teamName;
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

    public boolean getKindness() {
        return this.kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(getName() + " transforming into a surface transport");
        System.out.println(getName() + " transforming into an air transport");
        System.out.println(getName() + " transforming into a weapon");
        System.out.println(getName() + " transforming into equipment");
    }
}