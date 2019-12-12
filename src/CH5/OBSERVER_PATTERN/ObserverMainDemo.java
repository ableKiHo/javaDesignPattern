package CH5.OBSERVER_PATTERN;

public class ObserverMainDemo {
    public static void main(String[] args) {
        MainContent mainContent = new MainContent();
        Observer subscriver1 = new Subscriber1();
        Observer subscriver2 = new Subscriber2();

        mainContent.subscribe(subscriver1);
        mainContent.subscribe(subscriver2);

        mainContent.newPublishContent();
        mainContent.unsubscribe(subscriver2);

        mainContent.newPublishContent();
    }
}
