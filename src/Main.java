import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println(bumblebee.getTeamName());
        bumblebee.run(bumblebee.getName());
        bumblebee.fire(bumblebee.getName());
        bumblebee.charge(bumblebee.getName());
        bumblebee.transform();

        System.out.println();

        System.out.println(megatron.getTeamName());
        megatron.run(megatron.getName());
        megatron.fire(megatron.getName());
        megatron.charge(megatron.getName());
        megatron.transform();

        System.out.println();

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee);
        transformers.add(megatron);
        System.out.println(transformers);
    }
}