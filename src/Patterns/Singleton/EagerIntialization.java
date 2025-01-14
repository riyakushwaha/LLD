package Patterns.Singleton;

public class EagerIntialization {
    public static final EagerIntialization instance = new EagerIntialization();

    private EagerIntialization() {
    }

    public static EagerIntialization getInstance() {
        return instance;
    }
}
