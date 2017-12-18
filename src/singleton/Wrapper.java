package singleton;

public class Wrapper {
    private static Wrapper wrapper;

    private Wrapper() {}

    public static synchronized Wrapper getInstance() {
        if(wrapper == null) {
            wrapper = new Wrapper();
        }
        return wrapper;
    }
}
