package singleton;

public class Main {
    public static void main(String[] args) {
        Wrapper wrapper = Wrapper.getInstance();
        Wrapper wrapper1 = Wrapper.getInstance();
        System.out.println(wrapper);
        System.out.println(wrapper1);
    }
}
