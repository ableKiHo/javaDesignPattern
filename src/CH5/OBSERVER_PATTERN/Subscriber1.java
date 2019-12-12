package CH5.OBSERVER_PATTERN;

public class Subscriber1 implements Observer {
    @Override
    public void update() {
        System.out.println("구독자1 : update check");
    }
}
