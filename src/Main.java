import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println(bumblebee.teamName);
        bumblebee.run(bumblebee.name);
        bumblebee.fire(bumblebee.name);
        bumblebee.charge(bumblebee.name);
        bumblebee.transform();

        System.out.println();

        System.out.println(megatron.teamName);
        megatron.run(megatron.name);
        megatron.fire(megatron.name);
        megatron.charge(megatron.name);
        megatron.transform();

        System.out.println();

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee);
        transformers.add(megatron);
        System.out.println(transformers);
    }
}