package CH4.CREATE_PATTERN.Singleton;

public class TestSingleton {

    //TODO 인스턴스가 단 하나만 생성되는 것을 보장하고 어디서나 그 인스턴스에 접근가능

    private static TestSingleton myTestSingleton = new TestSingleton();

    private TestSingleton() {
        System.out.println("Singleton instance created...");
    }

    public static TestSingleton getInstance() {
        return myTestSingleton;
    }
}
