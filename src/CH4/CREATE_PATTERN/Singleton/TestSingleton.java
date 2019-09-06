package CH4.CREATE_PATTERN.Singleton;

public class TestSingleton {

    private static TestSingleton myTestSingleton = new TestSingleton();

    private TestSingleton() {
        System.out.println("Singleton instance created...");
    }

    public static TestSingleton getInstance() {
        return myTestSingleton;
    }
}
