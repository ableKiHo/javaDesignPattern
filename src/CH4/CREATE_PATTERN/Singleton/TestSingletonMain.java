package CH4.CREATE_PATTERN.Singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestSingletonMain {
    public static void main(String[] args) {
        //TODO new 연산자를 사용못함.
        //TestSingleton errTestSingleton = new TestSingleton();
        TestSingleton testSingleton = TestSingleton.getInstance();

        //TODO 예제를 보면.....

        //TODO 싱글턴 패턴의 문제점은 멀티스레딩 환경에서의 동기화!

        //TODO 유명한 사용 예는 스프링!

        //TODO 싱글턴 객체가 상태값을 가지고 있다면?

        //TODO 싱클통 특성상 상태관리에 주의를 기울여야.. 상태가 없는 무상태 형태로 만들어져야 하며

        //TODO 필요한 경우 로컬변수, 파라미터, 리턴 값등을 이용.
    }

    @Test
    public void singletonInstanceTest() {
        TestDto testDto1 = new TestDto();
        TestDto testDto2 = new TestDto();

        assertThat(testDto1.equals(testDto2), is(false));
        assertThat(testDto1 == testDto2, is(false));

        TestSingleton testSingleton1 = TestSingleton.getInstance();
        TestSingleton testSingleton2 = TestSingleton.getInstance();

        assertThat(testSingleton1 == testSingleton2, is(true));
        assertThat(testSingleton1.equals(testSingleton2), is(true));
    }

    static class TestDto {
        public TestDto() {
            System.out.println("Dto Instance Created...");
        }
    }
}
