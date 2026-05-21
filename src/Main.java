public class Main {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println(bumblebee.teamName);
        bumblebee.run();
        bumblebee.fire();
        bumblebee.charge();
        bumblebee.transform();

        System.out.println();

        System.out.println(megatron.teamName);
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
    }
}