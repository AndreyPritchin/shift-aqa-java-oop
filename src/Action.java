public interface Action {
    default void run(String name) {
        System.out.println(name + " is running");
    }

    void fire(String name);
    void charge(String name);
}
