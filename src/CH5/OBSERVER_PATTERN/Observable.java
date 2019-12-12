package CH5.OBSERVER_PATTERN;

public interface Observable {
    void subscribe(Observer o);

    void unsubscribe(Observer o);

    void alertForSubscribers();
}
