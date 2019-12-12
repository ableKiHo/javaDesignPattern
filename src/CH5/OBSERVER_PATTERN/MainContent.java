package CH5.OBSERVER_PATTERN;

import java.util.ArrayList;
import java.util.List;

public class MainContent implements Observable {
    List<Observer> observerList = new ArrayList<>();

    private boolean registerNewContent;

    public boolean isRegisterNewContent() {
        return registerNewContent;
    }

    public void newPublishContent() {
        System.out.println("신규 컨텐츠가 등록되었습니다.");
        registerNewContent = true;
        alertForSubscribers();
    }

    @Override
    public void subscribe(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void alertForSubscribers() {
        observerList.forEach(Observer::update);
    }
}
