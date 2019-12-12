package CH5.OBSERVER_PATTERN;

public class Subscriber2 implements Observer {
    @Override
    public void update() {
        System.out.println("구독자2 : 업데이트 확인");
    }
}
