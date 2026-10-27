public class Main {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println(bumblebee.getTeamName());
        bumblebee.run();
        bumblebee.fire();
        bumblebee.charge();
        bumblebee.transform();

        System.out.println();

        System.out.println(megatron.getTeamName());
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
    }
}